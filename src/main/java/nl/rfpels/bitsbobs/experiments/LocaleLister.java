//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.experiments;

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
