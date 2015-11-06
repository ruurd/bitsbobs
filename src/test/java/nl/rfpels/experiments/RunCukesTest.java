//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.experiments;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Run cucumber features in this package
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/features"})
public class RunCukesTest {}
