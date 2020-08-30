package TestRunnerExe;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/FeaturesStories",
        glue ={"Glue_Steps"},
        monochrome = true,
        tags = "@googleTag" , //   tags = "not @doNotExist" ,
        format = {"pretty", "html:target/Report", "json:target/cucumber.json"}  )

public class TestRunnerGoogle extends AbstractTestNGCucumberTests {  // extends von TestNG
    //@Parameters({"operatingSystem"})
    //@BeforeClass
    //public void beforeClass (String op_sysem) {
               //    doSomething()
    //}

}
