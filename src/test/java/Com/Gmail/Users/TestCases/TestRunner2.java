package Com.Gmail.Users.TestCases;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features =".\\src\\test\\java\\Com\\Gmail\\Users\\Features\\TourLogin.feature", glue = "Com.Gmail.Users.StepDef",
		plugin = {"pretty","html:Report/cucumber-report.html"}
		)

public class TestRunner2 extends AbstractTestNGCucumberTests {

}
