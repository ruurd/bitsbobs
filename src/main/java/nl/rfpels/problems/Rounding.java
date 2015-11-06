//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.problems;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * A small experiment on rounding in BigDecimal
 */
public class Rounding {
    public static void main(String[] args) {

        BigDecimal left = new BigDecimal("1.222");
        BigDecimal rite = new BigDecimal("1.222");
        BigDecimal sums = left.add(rite);
        sums = sums.setScale(0, RoundingMode.CEILING);
        System.out.println(left + "+" + rite + "=" + sums);
    }
}
