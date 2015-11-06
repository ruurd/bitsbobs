//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.problems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("squid:S2175")
public class BoxingTrouble {
    private static final Logger LOG = LoggerFactory.getLogger(BoxingTrouble.class);

    private BoxingTrouble() {
        //***NOP***
    }

    public static void main(String[] args) {
        Set<Short> setOfShorts = new HashSet<Short>();
        for (short i = 0; i < 10; i++) {
            setOfShorts.add(i);

            setOfShorts.remove(i - 1); // Ayee intermediary is int => Integer not Short. Meh!
        }
        LOG.info("# elements = " + setOfShorts.size());
    }
}
