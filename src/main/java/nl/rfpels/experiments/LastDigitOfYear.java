//------------------------------------------------------------------------------
// Copyright (c) 2014 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.experiments;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * What does a joda time DateTimeFormatter with a single 'y'?
 */
public class LastDigitOfYear {
    public static String get() {
        String y = DateTimeFormat.forPattern("yyyy").print(new DateTime());
        return y.substring(y.length() - 1, y.length());
    }
}
