//------------------------------------------------------------------------------
// Copyright (c) 2013 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.experiments;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Implementor test
 */
public class ImplementorTest {
    @Test
    public void testInstantiate() throws Exception {
        assertNotNull("cannot instantiate", new Implementor());
    }

    @Test
    public void testImplements() {
        Implementor implementor = new Implementor();
        assertTrue("not an Implementable", implementor instanceof Implementable);
    }

}
