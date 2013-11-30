//------------------------------------------------------------------------------
// Copyright (c) 2013 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.experiments;

import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

/**
 * Run cucumber features in this package
 */
@RunWith(Cucumber.class)
@Cucumber.Options(features = {"test/features"})
public class RunCukesTest {
    @AfterClass
    public static void afterClass() {
    }
}
