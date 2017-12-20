//------------------------------------------------------------------------------
// Copyright (c) 2017 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.lambdas;

public class OpaqueExt extends Opaque {

    @Override
    String getTheString(String s) {
        return s + s;
    }
}
