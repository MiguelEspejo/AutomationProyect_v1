package automationproyect_v1.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import automationproyect_v1.pages.BasePage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "automationproyect_v1.steps",
    plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-reports.json"},
    monochrome = true,
    tags = "@esc2"
  
)

public class runner{
    @AfterClass
    public static void cleanDriver(){
        BasePage.closeBrowser();
    }
    
}
