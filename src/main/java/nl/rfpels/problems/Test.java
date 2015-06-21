//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.problems;

/**
 * Test to see if importing is OK. In other versions there is a squiggly on Test.is(42)
 */
public class Test {
    public static void main(String[] args) {
        Test.is(42);
    }

    public static <T> void is(T t) {
    }
}
