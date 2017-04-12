package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

//to run with TestNG comment @Runwith and add Testng abstract class
//we can also add

//@RunWith(Cucumber.class)
@CucumberOptions (features = {"src/test/java/features/"}, format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},glue = "Steps")

public class TestRunner extends AbstractTestNGCucumberTests{

}