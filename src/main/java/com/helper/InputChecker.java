package com.helper;

public final class InputChecker {

    public static boolean badInputRange(long startIp, long endIp) {
        if (startIp > endIp) {
            return true;
        } else {
            return false;
        }
    }
}
