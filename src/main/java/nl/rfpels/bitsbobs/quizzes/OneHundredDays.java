//------------------------------------------------------------------------------
// Copyright (c) 2017 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.quizzes;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ruurd on 20-05-2017.
 */
public class OneHundredDays {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("Fred");
        coll.add("Jim");
        coll.add("Sheila");
        System.out.println("coll is " + coll);
        coll.remove(0); // 0 is not an object in the array so it fails to remove anything
        System.out.println("coll is " + coll);
    }
}
