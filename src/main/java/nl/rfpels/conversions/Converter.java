//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.conversions;

/**
 * Experimentation with conversions.
 */
public class Converter {

    private Converter() {

    }

    public static final Long toLong(String s) {
        return Long.parseLong(s);
    }
}
