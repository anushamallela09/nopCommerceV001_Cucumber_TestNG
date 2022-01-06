package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        plugin = {"pretty","html:target/cucumber-reports"},
        tags = "@SmokeTest",
        features = "src/test/resources",
        glue={"stepDefinitions"},
        dryRun = false
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider (parallel = true)
    public Object[][] scenarios() {

        return super.scenarios();
    }

}
