//------------------------------------------------------------------------------
// Copyright (c) 2017 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SortingByOther {

    private List<String> list = new ArrayList<>();

    public SortingByOther() {
        list.add("7");
        list.add("-1");
        list.add("5");
        list.add("x");
        list.add("3");
    }

    public List<String> getAll() {
        return list
                .stream()
                .sorted(Comparator.comparing(Integer::new)) // Ha. Numerically sort a list of strings by instantiating two Integers for comparison
                .collect(toList());
    }

    public static void main(String[] args) {
        SortingByOther o = new SortingByOther();
        for(String s: o.getAll()) {
            System.out.println(s);
        }
    }
}
