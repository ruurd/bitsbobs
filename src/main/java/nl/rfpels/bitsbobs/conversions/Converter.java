//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.conversions;

/**
 * Experimentation with conversions.
 */
public final class Converter {

    /**
     * Utility class constructor
     */
    private Converter() {
    }


    /**
     * Parse a string into the long it contains
     * @param s the string to convert
     * @return the long represented by the string passed
     */
    public static final Long toLong(final String s) {
        return Long.parseLong(s);
    }
}
