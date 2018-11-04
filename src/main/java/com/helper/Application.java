package com.helper;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) {
        //todo will add logging;
        String startIP = "";
        String endIP = "";
        System.out.println("Please enter first IP in range");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            startIP = reader.readLine();
            System.out.println("Please enter end IP in range");
            endIP = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long startIp = ipToLong(startIP);
        long endIp = ipToLong(endIP);
        for (long adress = startIp + 1; adress < endIp; adress++) {
            System.out.println(longToIp(adress));
        }


    }
    static long ipToLong(String ipAddress) {
        long result = 0;
        String[] ipAddressInArray = ipAddress.split("\\.");
        for (int i = 3; i >= 0; i--) {
            long ip = Long.parseLong(ipAddressInArray[3 - i]);
            // left shifting 24,16,8,0 and bitwise OR
            // 1. 192 << 24
            // 1. 168 << 16
            // 1. 1 << 8
            // 1. 2 << 0
            result |= ip << (i * 8);
        }
        return result;
    }

    static String longToIp(long i) {
        return ((i >> 24) & 0xFF) +
                "." + ((i >> 16) & 0xFF) +
                "." + ((i >> 8) & 0xFF) +
                "." + (i & 0xFF);
    }
}
