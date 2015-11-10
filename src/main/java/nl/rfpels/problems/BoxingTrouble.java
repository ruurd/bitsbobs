//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.problems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

/**
 * An example of how you can get into trouble by boxing.
 */
@SuppressWarnings("squid:S2175")
public final class BoxingTrouble {

    /**
     * The logger.
     */
    private static final Logger LOG = LoggerFactory.getLogger(BoxingTrouble.class);

    /**
     * Max number of loops.
     */
    private static final int MAXLOOPS = 10;

    /**
     * No construction necessary.
     */
    private BoxingTrouble() {
        //***NOP***
    }

    /**
     * Main. Capice?
     *
     * @param args the arguments passed to the program
     */
    public static void main(final String[] args) {
        Set<Short> setOfShorts = new HashSet<>();
        for (short i = 0; i < MAXLOOPS; i++) {
            setOfShorts.add(i);

            // Ayee intermediary is int => Integer not Short. Meh!
            setOfShorts.remove(i - 1);
        }
        LOG.info("# elements = " + setOfShorts.size());
    }
}
