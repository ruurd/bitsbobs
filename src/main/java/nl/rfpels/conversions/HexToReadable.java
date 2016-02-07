//------------------------------------------------------------------------------
// Copyright (c) 2016 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.conversions;

/**
 * Created by ruurd on 21-01-2016.
 */
public class HexToReadable {
    public static void main(String[] args) {
        String s = new String(new byte[]{0x50, 0x51, 0x52});
        System.out.println(s);
    }
}
