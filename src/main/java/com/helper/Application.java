package com.helper;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;

public class Application {
    public static void main(String[] args) {

        //todo will add logging;
        Inet4Address startAdress = null;
        Inet4Address endAdress = null;
        String startIP;
        String endIP;
        System.out.println("Please enter first IP in range");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            startIP = reader.readLine();
            System.out.println("Please enter end IP in range");
            endIP = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
