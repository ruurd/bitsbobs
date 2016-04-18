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

    private List<BigInteger> terms = new ArrayList<>();

    private BigInteger result = null;

    /**
     * Add a term to the list of terms.
     * @param term the term to add
     */
    public void addTerm(BigInteger term) {
        getTerms().add(term);
    }

    /**
     * The result.
     */ /**
     * Get the result. Returns null if the task has not been run.
     * @return the result.
     */
    public BigInteger getResult() {
        return result;
    }

    @Override
    public void run() {
        setResult(BigInteger.ZERO);
        for (BigInteger term: getTerms()) {
            setResult(getResult().add(term));
        }
    }

    /**
     * A list of terms.
     */
    public List<BigInteger> getTerms() {
        return terms;
    }

    public void setTerms(List<BigInteger> terms) {
        this.terms = terms;
    }

    public void setResult(BigInteger result) {
        this.result = result;
    }
}
