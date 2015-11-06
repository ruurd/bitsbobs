//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ruurd on 28-10-2015.
 */
public class BoxingTrouble {
    public static void main(String[] args) {
        Set<Short> setOfShorts = new HashSet<Short>();
        for (short i = 0; i < 10; i++) {
            setOfShorts.add(i);
            setOfShorts.remove(i - 1); // Ayee intermediary is int => Integer not Short. Meh!
        }
        System.out.println("# elements = " + setOfShorts.size());
    }
}
