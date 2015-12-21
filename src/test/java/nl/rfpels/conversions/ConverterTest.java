//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.conversions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Excercise conversions
 */
public class ConverterTest {

    @Test
    public void testToLongLeadingZeroes() throws Exception {
        assertThat(Converter.toLong("0001"), is(Long.valueOf(1)));
    }
}