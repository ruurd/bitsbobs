//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.problems;

import org.joda.time.DateTime;

/**
 * How do I create a nice timestamp including millis and timezone
 */
public class ISOTimeStamping {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Het is nu ");
        sb.append(DateTime.now());
        System.out.println(sb.toString());
    }
}
