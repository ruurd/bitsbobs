//------------------------------------------------------------------------------
// Copyright (c) 2016 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.running;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple task implemented as a Runnable. Implementing Runnable is to be preferred
 * over extending a Thread. This way the task is easily unit-testable and the object
 * can be used inline too by initializing the task and invoking run.
 */
public class AccumulatorTask implements Runnable {

    /**
     * A list of terms.
     */
    List<BigInteger> terms = new ArrayList<>();

    /**
     * The result.
     */
    BigInteger result = null;

    /**
     * Add a term to the list of terms.
     * @param term the term to add
     */
    public void addTerm(BigInteger term) {
        terms.add(term);
    }

    /**
     * Get the result. Returns null if the task has not been run.
     * @return the result.
     */
    public BigInteger getResult() {
        return result;
    }

    @Override
    public void run() {
        result = BigInteger.ZERO;
        for (BigInteger term: terms) {
            result = result.add(term);
        }
    }
}
