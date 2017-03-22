//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ruurd on 02-12-2015.
 */
public class TracerExample {
    private static final Logger LOGGER = LoggerFactory.getLogger(TracerExample.class);

    public static void main(String[] args) {
        Tracer.enter(LOGGER, TracerExample.class, "main", new Object[]{args});
        System.out.println("Tracer example");
        Tracer.exit(LOGGER, TracerExample.class, "main");
    }
}
