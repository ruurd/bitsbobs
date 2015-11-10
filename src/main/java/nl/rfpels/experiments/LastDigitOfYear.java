//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.experiments;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 * What does a joda time DateTimeFormatter with a single 'y'?
 */
public final class LastDigitOfYear {

    /**
     * Prevent construction. As it is now this is a utility.
     */
    private LastDigitOfYear() {
        //***NOP***
    }

    /**
     * Get the last digit of the year.
     * @return
     */
    public static String get() {
        String y = DateTimeFormat.forPattern("yyyy").print(new DateTime());
        return y.substring(y.length() - 1, y.length());
    }
}
