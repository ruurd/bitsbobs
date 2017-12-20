//------------------------------------------------------------------------------
// Copyright (c) 2017 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.lambdas;

import java.util.Optional;

public class Opaque {
    private Optional<String> opt;

    public Opaque() {
        opt = Optional.of("foo");
    }

    public Optional<String> explicit() {
        Optional<String> result = Optional.of("x");
        if (opt.isPresent()) {
            result = Optional.of(getTheString(opt.get()));
        }
        return result;
    }

    public Optional<String> implicit() {
        return opt.map(this::getTheString); // Whoa. Looks like a reference to this classes method but is not.
    }

    String getTheString(String s) {
        return s;
    }
}
