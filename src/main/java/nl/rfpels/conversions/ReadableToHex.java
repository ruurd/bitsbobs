//------------------------------------------------------------------------------
// Copyright (c) 2016 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.conversions;

/**
 * Created by ruurd on 21-01-2016.
 */
public class ReadableToHex {
    public static void main(String[] args) {
        String s = " !\"#$%&'()*+,-./:;<=>?@[]^_`{|}~";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(String.format("%x", (byte)c));
            System.out.print(" ");
        }
    }
}
