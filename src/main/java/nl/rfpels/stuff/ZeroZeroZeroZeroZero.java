//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.stuff;

/**
 * Uhm I don't know anymore. Oh. OK. It prints 5 zeroes.
 */
public class ZeroZeroZeroZeroZero {
    int i = 0;

    void m() {
        for (int k = 0; k < 5; k++) {
            i = i++;
            System.out.println(i);
        }
    }

    int getI() {
        return i;
    }

    public static void main(String[] args) {
        ZeroZeroZeroZeroZero z = new ZeroZeroZeroZeroZero();
        z.m();
        System.out.println(z.getI());
    }
}
