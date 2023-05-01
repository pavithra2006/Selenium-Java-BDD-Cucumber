//package parallel;
//
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//import org.testng.annotations.DataProvider;
//
//@CucumberOptions(
//        features = {"src/test/resources/parallel"}
//        , glue = {"parallel", "com/hooks"}
//        , plugin = {"pretty"
//        , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//        , "timeline:test-output-thread/"
//        , "rerun:target/failedTcs.txt"} //creates a text file containing failed tcs under target folder
//        , tags = "not @Skip"
//)
//public class TestNgRunner extends AbstractTestNGCucumberTests {
//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        System.out.println("testNg runner");
//        return super.scenarios();
//    }
//
//}
