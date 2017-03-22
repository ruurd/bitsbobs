//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.experiments;

import javax.crypto.Cipher;
import java.security.NoSuchAlgorithmException;

/**
 * Check which crypto strength you have
 */
public class CryptoStrength {
    public static void main(String[] args) {
        try {
            int maxKeyLen = Cipher.getMaxAllowedKeyLength("AES");
            if (maxKeyLen == 128) {
                System.out.println("You do not have the unlimited JCE policy files!");
            } else {
                System.out.println("You have the unlimited JCE policy files! Good to go! Key length is " + maxKeyLen);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
