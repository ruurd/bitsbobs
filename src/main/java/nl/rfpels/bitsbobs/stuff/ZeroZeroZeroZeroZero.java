//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.stuff;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Uhm I don't know anymore. Oh. OK. It prints 5 zeroes.
 */
public class ZeroZeroZeroZeroZero {
    private static final Logger LOG = LoggerFactory.getLogger(ZeroZeroZeroZeroZero.class);
    int i = 0;

    private ZeroZeroZeroZeroZero() {
        //***NOP***
    }

    @SuppressWarnings("squid:S2123")
    void m() {
        for (int k = 0; k < 5; k++) {
            i = i++;
            LOG.info(String.valueOf(i));
        }
    }

    int getI() {
        return i;
    }

    public static void main(String[] args) {
        ZeroZeroZeroZeroZero z = new ZeroZeroZeroZeroZero();
        z.m();
        LOG.info(String.valueOf(z.getI()));
    }
}
