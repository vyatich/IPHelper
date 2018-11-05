package com.helper;

import org.junit.Test;

import static com.helper.InputChecker.badInputRange;
import static org.junit.Assert.*;

public class InputCheckerTest {

    @Test
    public void badInputRange_shouldBeTrue () {
        final boolean actualValue = badInputRange(10L, 0L);

        assertTrue(actualValue);
    }
}
