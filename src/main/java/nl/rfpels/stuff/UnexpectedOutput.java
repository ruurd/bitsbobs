//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.stuff;

/**
 * Does not output the expected output True True because float and double comparison is
 * always inexact and depends on wether the value can be represented exactly in a float
 * or double.
 */
public class UnexpectedOutput {

    public static void main(String[] args) {
        float f1 = 3.2f;
        float f2 = 3.5f;
        if (f1 == 3.2) {
            System.out.println("f1 is True");
        } else {
            System.out.println("f1 is False");
        }
        if (f2 == 3.5) {
            System.out.println("f2 is True");
        } else {
            System.out.println("f2 is False");
        }
    }
}