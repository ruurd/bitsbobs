//------------------------------------------------------------------------------
// Copyright (c) 2017 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.annotations;

import org.jetbrains.annotations.NotNull;

public class DontPassNull {
    private String s;

    public DontPassNull(@NotNull String s) {
        this.s = s;
    }

    public static void main(String[] args) {
        DontPassNull n = new DontPassNull(null);
    }
}
