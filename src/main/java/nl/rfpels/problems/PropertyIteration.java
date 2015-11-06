//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.problems;

import java.util.Properties;

/**
 * Created by ruurd on 19/09/15.
 */
public class PropertyIteration {
    public static void main(String[] args) {
        Properties plist = new Properties();
        plist.setProperty("localhost", "123");
        plist.setProperty("localhost", "234");

        plist.list(System.out);
    }
}
