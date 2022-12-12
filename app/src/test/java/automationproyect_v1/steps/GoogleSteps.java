package automationproyect_v1.steps;

import automationproyect_v1.pages.GooglePage;
import io.cucumber.java.en.*;



public class GoogleSteps {

  GooglePage google = new GooglePage();
  
  @Given("^Navego a google$")
  public void navigateToGoogle(){
    google.navigateToGoogle();

  }

  @When("^Capturo los param para buscar$")
  public void captureParamToSearch(){
    //hardcode: before create with cucumber more inputs
    google.captureSearchCriteria("hola mundo");

  }

  @And("^clic en el boton buscar$")
  public void clicOnBtnBuscar(){
    google.clickBtnSearchGoogle();
    
  }

  @Then("^obtengo resultados de la busqueda$")
  public void validateResult(){

  }
  
  
    
}
