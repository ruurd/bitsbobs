//------------------------------------------------------------------------------
// Copyright (c) 2016 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.stuff;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Excercise regular expressions
 */
public class RegularExpressions {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".*[0-9\\x20-\\x2F\\x3A-\\x40\\x5B-\\x60\\x7B-\\x7E].*");
        Matcher m = p.matcher("XXX !#$%XXX");
        if (m.matches()) {
            System.out.println(m.toMatchResult());
        }
    }
}
