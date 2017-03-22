//------------------------------------------------------------------------------
// Copyright (c) 2016 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.locales;

import java.util.Locale;

/**
 * Created by ruurd on 03-08-2016.
 */
public class ListLocaleCodes {

    public static void main(String[] args) {
        for (Locale loc: Locale.getAvailableLocales()) {
            System.out.println("========================================================");
            System.out.println(loc.toLanguageTag());
            System.out.println(loc.getISO3Language());
            System.out.println(loc.getDisplayCountry());
            System.out.println(loc.getDisplayName());
        }
    }
}
