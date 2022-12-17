package automationproyect_v1.steps;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import automationproyect_v1.pages.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;


public class Hooks extends BasePage{

    public Hooks() {
        super(driver);
  
    }

     @After
     public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            scenario.log("Escenario Fallado");
            final byte[] screenshot = ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot,"image/png", "image-report");

        }
     }

        
}
