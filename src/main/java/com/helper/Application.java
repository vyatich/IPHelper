package com.helper;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.helper.Converter.ipToLong;
import static com.helper.Converter.longToIp;
import static com.helper.InputChecker.badInputRange;

public class Application {

    static String startIP = "";
    static String endIP = "";

    public static void main(String[] args) {
        System.out.println("Please enter first IP in range");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            startIP = reader.readLine();
            System.out.println("Please enter end IP in range");
            endIP = reader.readLine();
        } catch (IOException e) {
            System.out.println("Input|output exeption");
        }
        writeIpRange();
    }

    private static void writeIpRange() {
        long startIp = ipToLong(startIP);
        long endIp = ipToLong(endIP);

        if(badInputRange(startIp, endIp)) {
            System.out.println("Диапазон неверен, начальный адрес больше конечного");
        } else {
            for (long adress = startIp + 1; adress < endIp; adress++) {
                System.out.println(longToIp(adress));
            }
        }
    }
}
