package automationproyect_v1.steps;


import org.junit.Assert;

import automationproyect_v1.pages.GooglePage;
import io.cucumber.java.en.*;



public class GoogleSteps {

  GooglePage google = new GooglePage();
  
  @Given("^Navego a google$")
  public void navigateToGoogle(){
    google.navigateToGoogle();

  }

  @When("^Capturo el (.+) param para buscar$")
  public void captureParamToSearch(String criteraToSearch){
    //hardcode: before create with cucumber more inputs
    google.captureSearchCriteria(criteraToSearch);

  }

  @And("^clic en el boton buscar$")
  public void clicOnBtnBuscar(){
    google.clickBtnSearchGoogle();
    
  }

  @Then("^obtengo resultados de la busqueda$")
  public void validateResult(){
    Assert.assertEquals("Herramientas", google.resultSearchGoogle());

  }
  
  
    
}
