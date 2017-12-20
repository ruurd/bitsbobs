//------------------------------------------------------------------------------
// Copyright (c) 2017 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.collections;

import org.apache.commons.lang3.ArrayUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by ruurd on 26-04-2017.
 */
public class SortHashmapValues {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        Set<String> s = new HashSet<>();
        s.addAll(m.values());
    }}
