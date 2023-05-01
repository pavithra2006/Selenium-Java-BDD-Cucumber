//package parallel;
//
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//import org.testng.annotations.DataProvider;
//
//@CucumberOptions(
//        features = {"@target/failedTcs.txt"}
//        , glue = {"parallel", "com/hooks"}
//        , plugin = {"pretty"
//        , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//        , "timeline:test-output-thread/"
//        , "rerun:target/failedTcs.txt"}
//)
//
//public class FailedTcsRunner extends AbstractTestNGCucumberTests {
//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        System.out.println("testNg failed tcs runner");
//        return super.scenarios();
//    }
//}
