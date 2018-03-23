//------------------------------------------------------------------------------
// Copyright (c) 2018 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.experiments;

import org.junit.Test;

public class ImplementableTest {
    @Test
    public void listImplementors() {
        Implementable.class.getDeclaredClasses();
    }
}
