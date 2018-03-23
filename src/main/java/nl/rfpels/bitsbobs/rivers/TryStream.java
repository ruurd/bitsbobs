//------------------------------------------------------------------------------
// Copyright (c) 2017 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.rivers;

import java.util.stream.Stream;

/**
 * Created by ruurd on 03-05-2017.
 */
public class TryStream {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(10, i -> i + 1);
        int first = stream.filter(i -> i < 10).findFirst().get();
        System.out.println(first);

    }
}
