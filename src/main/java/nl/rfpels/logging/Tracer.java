//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.logging;

import org.slf4j.Logger;

/**
 * A little class that functions as an entry and exit logger. Logs at the lowest
 * possible level meaning you have to turn on debug logging to see the traces.
 */
public final class Tracer {

    /**
     * Private utility class constructor.
     */
    private Tracer() {
        // ***NOP***
    }

    /**
     * Log the entry into a method passing args.
     * @param logger the logger to log to
     * @param clazz the type of the object
     * @param method the method in the class
     * @param args the list of arguments
     */
    public static void enter(final Logger logger, final Class clazz, final String method, final Object[] args) {
        if (logger.isTraceEnabled()) {
            StringBuilder bldr = new StringBuilder("ENTER: ")
                    .append(clazz.getSimpleName())
                    .append(".")
                    .append(method)
                    .append("(");
            for (int i = 0; i < args.length; i++) {
                if (i > 0) {
                    bldr.append(", ");
                }
                bldr.append(args[i]);
            }
            bldr.append(")");
            logger.trace(bldr.toString());
        }
    }

    /**
     * Log the exit out of a method returning void.
     * @param logger the logger to log to
     * @param clazz the type of the object
     * @param method the method in the class
     */
    public static void exit(final Logger logger, final Class clazz, final String method) {
        if (logger.isTraceEnabled()) {
            StringBuilder bldr = new StringBuilder(" EXIT: ")
                    .append(clazz.getSimpleName())
                    .append(".")
                    .append(method)
                    .append("()");
            logger.trace(bldr.toString());
        }
    }

    /**
     * Log the exit out of a method returning T.
     * @param <T> the type of the result
     * @param logger the logger to log to
     * @param clazz the type of the object
     * @param method the method in the class
     * @param result the result of the call
     * @return T the result returned from the method
     */
    public static <T> T exit(final Logger logger, final Class clazz, final String method, final T result) {
        if (logger.isTraceEnabled()) {
            StringBuilder bldr = new StringBuilder(" EXIT: ")
                    .append(clazz.getSimpleName())
                    .append(".")
                    .append(method)
                    .append("() => ")
                    .append(result.toString());
            logger.trace(bldr.toString());
        }
        return result;
    }
}
