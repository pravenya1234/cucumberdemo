package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue={"stepDefinition"},tags={"@valid,@invalid"})

public class TestRunnerDemo {

}
