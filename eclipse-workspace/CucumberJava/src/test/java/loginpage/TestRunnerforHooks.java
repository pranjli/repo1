package loginpage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/HooksDemo/hookesdemo1.feature", 
glue={"stepsforHooks"}
//tags="@smoke and not @regression"
		)

public class TestRunnerforHooks {
	

}
