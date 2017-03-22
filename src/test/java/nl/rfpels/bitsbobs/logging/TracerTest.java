//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.logging;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;
import org.slf4j.Marker;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

/**
 * Test the tracer. No need to do all kinds of difficult mocking, the tracer only
 * uses the logger as the means of output. It does not initialize a logger itself.
 */
@RunWith(PowerMockRunner.class)
public class TracerTest {

    @Mock
    private Logger logger;

    @Before
    public void before() {
        logger = mock(Logger.class);
        when(logger.isTraceEnabled()).thenReturn(true);
        when(logger.isTraceEnabled(any(Marker.class))).thenReturn(true);
    }

    @Test
    public void testEnterNoArgs() throws Exception {
        Tracer.enter(logger, TracerTest.class, "testEnter", new Object[]{});
        verify(logger, times(1)).trace("ENTER: TracerTest.testEnter()");

    }

    @Test
    public void testEnterOnePrimitiveArgs() throws Exception {
        int foo = 42;
        Tracer.enter(logger, TracerTest.class, "testEnter", new Object[]{foo});
        verify(logger, times(1)).trace("ENTER: TracerTest.testEnter(42)");

    }

    @Test
    public void testEnterMorePrimitiveArgs() throws Exception {
        int foo = 42;
        boolean bar = false;
        char qux = 'y';
        Tracer.enter(logger, TracerTest.class, "testEnter", new Object[]{foo, bar, qux});
        verify(logger, times(1)).trace("ENTER: TracerTest.testEnter(42, false, y)");

    }

    @Test
    public void testEnterOneObjectArgs() throws Exception {
        Integer foo = 42;
        Tracer.enter(logger, TracerTest.class, "testEnter", new Object[]{foo});
        verify(logger, times(1)).trace("ENTER: TracerTest.testEnter(42)");

    }

    @Test
    public void testEnterMoreObjectArgs() throws Exception {
        Integer foo = 42;
        Boolean bar = false;
        String qux = "ycombi";
        Tracer.enter(logger, TracerTest.class, "testEnter", new Object[]{foo, bar, qux});
        verify(logger, times(1)).trace("ENTER: TracerTest.testEnter(42, false, ycombi)");

    }

    @Test
    public void testEnterMoreObjectArgsAndNulls() throws Exception {
        Integer foo = 42;
        Boolean bar = false;
        String qux = "ycombi";
        Tracer.enter(logger, TracerTest.class, "testEnter", new Object[]{foo, null, bar, null, qux});
        verify(logger, times(1)).trace("ENTER: TracerTest.testEnter(42, null, false, null, ycombi)");

    }

    @Test
    public void testEnterMixedArgs() throws Exception {
        Integer foo = 42;
        boolean bar = false;
        String qux = "ycombi";
        Tracer.enter(logger, TracerTest.class, "testEnter", new Object[]{foo, bar, qux});
        verify(logger, times(1)).trace("ENTER: TracerTest.testEnter(42, false, ycombi)");

    }

    @Test
    public void testEnterMixedArgsAndNulls() throws Exception {
        Integer foo = 42;
        boolean bar = false;
        String qux = "ycombi";
        Tracer.enter(logger, TracerTest.class, "testEnter", new Object[]{foo, null, bar, null, qux});
        verify(logger, times(1)).trace("ENTER: TracerTest.testEnter(42, null, false, null, ycombi)");

    }

    @Test
    public void testVoidExit() throws Exception {
        Tracer.exit(logger, TracerTest.class, "testEnter");
        verify(logger, times(1)).trace(" EXIT: TracerTest.testEnter()");
    }

    @Test
    public void testExitReturning() throws Exception {
        String result = "RESULT";
        Object returned = Tracer.exit(logger, TracerTest.class, "testEnter", result);
        verify(logger, times(1)).trace(" EXIT: TracerTest.testEnter() => RESULT");
        assertThat(returned, instanceOf(String.class));
        assertThat(returned, is(result));
    }
}