//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.experiments;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 */
public class DerivedClassTest {

    @Test
    public void IsATest() {
        DerivedClass derivedObject = new DerivedClass();
        assertThat("should be an Implementable", derivedObject instanceof Implementable, is(true));
        assertThat("should be a BaseClass", derivedObject instanceof BaseClass, is(true));
    }
}
