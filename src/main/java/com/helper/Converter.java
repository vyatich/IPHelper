package com.helper;

public final class Converter {

    static long ipToLong(String ipAddress) {
        long result = 0;
        String[] ipAddressInArray = ipAddress.split("\\.");
        for (int i = 3; i >= 0; i--) {
            try {
                long ip = Long.parseLong(ipAddressInArray[3 - i]);
                result |= ip << (i * 8);
            } catch (NumberFormatException nfe) {
                System.out.println("Данные - " + ipAddress + " - введены неверно");
                break;
            } catch (ArrayIndexOutOfBoundsException aiooe) {
                System.out.println("Данные - " + ipAddress + " - введены неверно");
                break;
            }
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
