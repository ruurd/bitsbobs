//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.unittesting;

/**
 * Created by ruurd on 03-12-2015.
 */
public class Thrower {
    public class Stuff extends Exception {}

    public void doThrow() {
        throw new RuntimeException("foo");
    }

    public void throwStuff() throws Stuff {
        throw new Stuff();
    }
}
