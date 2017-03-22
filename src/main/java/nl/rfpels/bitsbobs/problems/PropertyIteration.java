//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.problems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * Created by ruurd on 19/09/15.
 */
public class PropertyIteration {
    private static final Logger LOG = LoggerFactory.getLogger(PropertyIteration.class);

    private PropertyIteration() {
        //***NOP***
    }

    public static void main(String[] args) {
        Properties plist = new Properties();
        plist.setProperty("localhost", "123");
        plist.setProperty("localhost", "234");

        LOG.info(plist.toString());
    }
}
