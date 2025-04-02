package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin= {"pretty",
        "html:target/cucumber-reports/Cucumber.html",
        "json:target/cucum ber-reports/Cucumber.json"},
     features= "src\\test\\resources\\Features\\Loginhrm.feature",
     glue="Stepdefinition")
public class Runnerclass extends AbstractTestNGCucumberTests{
  
}
