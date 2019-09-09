package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Selenium\\com.dataDrivenCucumber\\src\\main\\java\\features\\LoginWithDataDriven.feature",
glue="StepDefinition")
public class TestRunner {

}
