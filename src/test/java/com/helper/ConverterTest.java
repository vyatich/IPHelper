package com.helper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    String goodAddress;
    String badAddress;
    long goodIp;

    @Before
    public void setUp() {
        goodAddress = "192.168.0.1";
        badAddress = "rfhfrfsf";
        goodIp = 3232235521L;
    }

    @Test
    public void ipToLong_shouldBeNull() {
        final long expectedValue = 0L;

        final long actualValue = Converter.ipToLong(badAddress);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void ipToLong_shouldBeLong() {
        final long actualValue = Converter.ipToLong(goodAddress);

        assertEquals(goodIp, actualValue);
    }

    @Test
    public void longToIp_shouldBeIpAddress() {
        final String actualValue = Converter.longToIp(goodIp);

        assertEquals(goodAddress, actualValue);
    }
}
