package automationproyect_v1.steps;

import automationproyect_v1.pages.MercadolibrePage;
import io.cucumber.java.en.*;

public class MercadolibreSteps {

    MercadolibrePage mercadoLibre = new MercadolibrePage();

    @Given("^Navego a MercadoLibre$")
    public void navigateToGoogle(){
      mercadoLibre.navigateToGoogle();
  }
    
}

