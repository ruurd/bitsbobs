//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.conversions;

/**
 * Created by ruurd on 10-12-2015.
 */
public class Converter {

    private Converter() {

    }

    public static final Long toLong(String s) {
        return Long.parseLong(s);
    }
}
