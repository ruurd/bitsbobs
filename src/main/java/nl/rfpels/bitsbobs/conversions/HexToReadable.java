//------------------------------------------------------------------------------
// Copyright (c) 2016 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.conversions;

/**
 * Just horsing around with hex bytes.
 */
final class HexToReadable {

    /**
     * Private ctor for utility class.
     */
    private HexToReadable() {
    }

    /**
     * Main entry point.
     * @param args unused really. I happily discard any.
     */
    public static void main(final String[] args) {
        String s = new String(new byte[]{0x50, 0x51, 0x52});
        System.out.println(s);
    }
}
