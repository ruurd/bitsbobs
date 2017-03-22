//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.experiments;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * What is the class of null?
 */
public class InstanceOfNullTest {

    @Test(expected = AssertionError.class)
    public void testInstanceOfNull() {
        assertTrue("hey", null instanceof Object);
    }
}
