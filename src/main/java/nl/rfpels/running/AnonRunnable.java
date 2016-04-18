//------------------------------------------------------------------------------
// Copyright (c) 2016 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.running;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Logs Foo Bar. Or Bar Foo. How to guarantee Foo Bar output?
 */
public final class AnonRunnable {

    /**
     * The logger for this class.
     */
    public static final Logger LOGGER = LoggerFactory.getLogger(AnonRunnable.class);

    /**
     * A second worth of millis.
     */
    public static final int ONE_SECOND = 1000;

    /**
     * Private utility class ctor.
     */
    private AnonRunnable() {
        // ***NOP***
    }

    /**
     * Main.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(ONE_SECOND);
                    LOGGER.info("Foo");
                } catch (InterruptedException ix) {
                    LOGGER.warn("Interrupted");
                }
            }
        });
        t.start();
        //t.join();
        LOGGER.info("Bar");
    }
}
