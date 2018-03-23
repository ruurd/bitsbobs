//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.experiments;

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

    @Test
    public void testEnumerateImplementations() {
        Class[] subs = Implementable.class.getClasses();
        for (int i = 0; i < subs.length; i++) {
            System.out.println(subs[i]);
        }
    }
}
