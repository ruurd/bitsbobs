//------------------------------------------------------------------------------
// Copyright (c) 2017 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.lambdas;

public class OpaqueMain {
    public static void main(String[] args) {
        OpaqueExt x = new OpaqueExt();
        String s = x.implicit().get();
        String t = x.explicit().get();
    }
}
