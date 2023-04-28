package parallel;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = {"src/test/resources/parallel"}
        , glue = {"parallel", "com/hooks"}
        , plugin = {"pretty"}
)
public class SerenityRunner {
}
