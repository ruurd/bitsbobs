//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.stuff;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Does not output the expected output True True because float and double comparison is
 * always inexact and depends on wether the value can be represented exactly in a float
 * or double.
 */
@SuppressWarnings("squid:S1244")
public class UnexpectedOutput {
    private static final Logger LOG = LoggerFactory.getLogger(UnexpectedOutput.class);

    private UnexpectedOutput() {
        //***NOP***
    }

    public static void main(String[] args) {
        float f1 = 3.2f;
        float f2 = 3.5f;
        if (f1 == 3.2) {
            LOG.info("f1 is True");
        } else {
            LOG.info("f1 is False");
        }
        if (f2 == 3.5) {
            LOG.info("f2 is True");
        } else {
            LOG.info("f2 is False");
        }
    }
}