package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.bson.io.BsonOutput;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/LoginPage.feature"}
        , glue = {"com/stepdefinitions"}
        , plugin = {"pretty"}
//        , "json:target/output-report/report.json"
//        , "junit:target/output-report/report.xml"}
//        , publish = true    // reports will be retained only for 1 day
//        , monochrome = true
//        , dryRun = true
)
public class TestRunner {
}