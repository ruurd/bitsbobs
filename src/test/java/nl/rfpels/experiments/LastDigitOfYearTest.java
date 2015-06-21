//------------------------------------------------------------------------------
// Copyright (c) 2014 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.experiments;

import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 */
public class LastDigitOfYearTest {
    @Test
    public void testGet() throws Exception {
        String lastDigit = String.valueOf(new DateTime().get(DateTimeFieldType.year()) % 10);
        assertThat("Incorrect last digit", LastDigitOfYear.get(), is(lastDigit));
    }
}
