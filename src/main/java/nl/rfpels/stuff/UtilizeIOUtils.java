//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.stuff;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by ruurd on 27-10-2015.
 */
public class UtilizeIOUtils {
    private static Log LOG = LogFactory.getLog(UtilizeIOUtils.class);

    public static void main(String[] args) {

        try {
            String s = IOUtils.toString(new FileReader(new File("cannotfind.txt")));
        } catch (FileNotFoundException fnfx) {
            LOG.info("Cannot find file", fnfx);
        } catch (IOException iox) {
            LOG.error("IO Exception", iox);
        }
    }
}
