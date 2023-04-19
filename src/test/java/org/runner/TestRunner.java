package org.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/org/features"} // defines the feature file path
        , glue = {"org/stepdefinition"}     //defines step definition path
        , plugin = {"pretty"}   //in terminal we will get scenario steps with respective logs, along with method name
)
public class TestRunner {
}