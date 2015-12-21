//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.unittesting;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by ruurd on 03-12-2015.
 */
public class ThrowerTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testDoThrow() {
        Thrower t = new Thrower();

        thrown.expect(RuntimeException.class);
        t.doThrow();
        fail("PC DOES WHAT?"); // <= does not get here
    }

    @Test
    public void testThrowStuff() throws Exception {
        Thrower t = new Thrower();

        thrown.expect(RuntimeException.class);
        t.throwStuff();
        fail("PC DOES WHAT?"); // <= does not get here either
    }
}