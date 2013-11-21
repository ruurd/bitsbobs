//------------------------------------------------------------------------------
// Copyright (c) 2013 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------

package nl.rfpels.experiments;

/**
 * A class to test names on
 */
public class ClassyName {

    public String getMyName() {
        return getClass().getName();
    }
    public String getMyCanonicalName() {
        return getClass().getCanonicalName();
    }
    public String getMySimpleName() {
        return getClass().getSimpleName();
    }

    public static void main(String[] args) {
        ClassyName n = new ClassyName();

        System.out.println(n.getMyName());
        System.out.println(n.getMyCanonicalName());
        System.out.println(n.getMySimpleName());
    }
}
