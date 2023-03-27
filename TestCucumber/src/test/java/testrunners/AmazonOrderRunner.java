package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures/AmazonOrder.feature"},
		glue = {"stepDefenitions","Amazonhooks"},
		plugin = {"pretty"}
		)

public class AmazonOrderRunner {

}
