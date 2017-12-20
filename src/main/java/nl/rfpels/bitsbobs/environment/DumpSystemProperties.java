//------------------------------------------------------------------------------
// Copyright (c) 2017 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.environment;

import java.util.Properties;

/**
 * Dump all system properties.
 * In hindsight this was easy.
 */
public class DumpSystemProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
    }
}
