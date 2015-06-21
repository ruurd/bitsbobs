//------------------------------------------------------------------------------
// Copyright (c) 2014 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.processors;

/**
 * Exception for processors. Wrap other exceptions that occur in this exception
 * before throwing an exception that leaves the module.
 */
public class ProcessorException extends Exception {
    public ProcessorException() {
        super();
    }

    public ProcessorException(String message) {
        super(message);
    }

    public ProcessorException(Throwable cause) {
        super(cause);
    }

    public ProcessorException(String message, Throwable cause) {
        super(message, cause);
    }
}
