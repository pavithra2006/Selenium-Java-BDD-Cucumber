package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"}
        , glue = {"com/stepdefinitions", "com/hooks"}
        , plugin = {"pretty"
        , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        , "timeline:test-output-thread/"}   // to check in which thread which tcs exectured in index.html file
//        , monochrome = true
//        , dryRun = true
)
public class TestRunner {
}