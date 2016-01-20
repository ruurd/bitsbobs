//------------------------------------------------------------------------------
// Copyright (c) 2016 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.running;

import org.junit.Test;

import java.math.BigInteger;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Show that it is very easy to test imeplementations of Runnable
 */
public class AccumulatorTaskTest {

    @Test
    public void testRun() throws Exception {
        AccumulatorTask t = new AccumulatorTask();
        t.addTerm(BigInteger.TEN);
        t.addTerm(BigInteger.ONE);
        t.run();
        assertThat(t.getResult(), is(BigInteger.valueOf(11L)));

    }
}