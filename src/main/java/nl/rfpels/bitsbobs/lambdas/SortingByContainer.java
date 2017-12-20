//------------------------------------------------------------------------------
// Copyright (c) 2017 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.lambdas;

import java.util.*;

import static java.util.stream.Collectors.toList;

/**
 * This is an example where the encounter order of the stream is affected by the sort order in the container.
 * If there is no sort order imposed the encounter order often is the order in which the elements are added to the container.
 */
public class SortingByContainer {

    private Set<String> setOfStrings = new TreeSet<>();

    public SortingByContainer() {
        setOfStrings.add("7");
        setOfStrings.add("-1");
        setOfStrings.add("5");
        setOfStrings.add("x");
        setOfStrings.add("3");
    }

    public List<String> getAll() {
        return setOfStrings
                .stream()
                .collect(toList());
    }

    public static void main(String[] args) {
        SortingByContainer o = new SortingByContainer();
        for(String s: o.getAll()) {
            System.out.println(s);
        }
    }
}
