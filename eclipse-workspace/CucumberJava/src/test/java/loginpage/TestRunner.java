package loginpage;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturewithTags", 
glue={"loginpage"},
tags= "@smoke and not @regression"
		)

public class TestRunner {
	

}
