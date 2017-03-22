//------------------------------------------------------------------------------
// Copyright (c) 2016 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.inspections;

/**
 * At the if statmement inspection says that o is always null. Output is
 * hello
 * fred
 * fred
 * fred
 *
 * Technically speaking the inspection on the line containing <code>if (o == null)</code> stating
 * that the comparison is always true is wrong, however, this is only the case if we assign a
 * value to it in the <code>finally</code> block which is weird.
 */
public class ForIfContinue {

    public static void main(String[] args) {
        ForIfContinue.run();
    }

    public static void run() {
        Object o = null;
        for (int i = 0; i < 4; i++) {
            try {
                if (o == null) { // inspection says this is always true
                    System.out.println("hello");
                    continue;
                }
                System.out.println("fred");
            } finally {
                o = "";
            }
        }
    }
}
