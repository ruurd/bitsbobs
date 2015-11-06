//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------

package nl.rfpels.experiments;

/**
 * A class to test class names on
 */
public class ClassyName {

    public static String getMyName(Class clzz) {
        return clzz.getName();
    }

    public static String getMyCanonicalName(Class clzz) {
        return clzz.getCanonicalName();
    }

    public static String getMySimpleName(Class clzz) {
        return clzz.getSimpleName();
    }
}
