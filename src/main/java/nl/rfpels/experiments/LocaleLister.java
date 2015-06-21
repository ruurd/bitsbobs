//------------------------------------------------------------------------------
// Copyright (c) 2014 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.experiments;

import java.util.*;

/**
 * Curiouser and curiouser...
 */
public class LocaleLister {
    public static void main(String[] args) {
        SortedSet<String> localeNames = new TreeSet<String>();
        for (Locale locale: Locale.getAvailableLocales()) {
            localeNames.add(locale.toString());
        }
        for (String name: localeNames) {
            System.out.println(name);
        }
    }
}
