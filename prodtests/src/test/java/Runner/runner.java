package Runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.After;
import org.junit.runner.RunWith;
import StepDefs.stepdefs;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features", glue = "src/test/java/StepDefs")


public class runner {



}

