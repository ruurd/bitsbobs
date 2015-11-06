//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.problems;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * How do I create a nice timestamp including millis and timezone
 */
public class ISOTimeStamping {
    private static final Logger LOG = LoggerFactory.getLogger(ISOTimeStamping.class);

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Het is nu ");
        sb.append(DateTime.now());
        LOG.info(sb.toString());
    }
}
