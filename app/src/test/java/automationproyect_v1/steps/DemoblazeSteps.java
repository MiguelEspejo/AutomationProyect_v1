package automationproyect_v1.steps;

import automationproyect_v1.pages.DemoblazePage;
import io.cucumber.java.en.*;

public class DemoblazeSteps {

    DemoblazePage tiendaDemoBlaze = new DemoblazePage();

    @Given("^Navego a la tienda DemoBlaze$")
    public void navigateToTiendaDemoBlaze() {
        tiendaDemoBlaze.navigateToDemoBlaze();
    }

    @When("^Selecciono diferentes productos de la tienda y los agrego al carrito$")
    public void selProdTienda() throws InterruptedException {
        tiendaDemoBlaze.selectArcticulos();
    }

    @Then("^Ingreso al carrito y valido que se muestren correctamente$")
    public void carritoCompras() throws InterruptedException {
        tiendaDemoBlaze.terminarCompra();
    }

    //eliminar productos del carrito
    @When("^Selecciono diferentes productos de tienda de la categoria laptops$")
    public void selProdTiendaEliminar() throws InterruptedException {
        tiendaDemoBlaze.selectArcticulosEliminar();
    }

    @Then("^Ingreso al carrito y elimino productos no deseados$")
    public void carritoComprasEliminar() throws InterruptedException {
        tiendaDemoBlaze.eliminarProdCarrito();
    }

    //Captura mensaje para contacto
    @When("^Selecciono la opcion contacto$")
    public void selecOpcContacto() throws InterruptedException {
        tiendaDemoBlaze.selecionarContacto();
    }

    @Then("^Capturo la infomracion de contacto y envio el mensaje$")
    public void capturaInfContac() throws InterruptedException {
        tiendaDemoBlaze.capturaInfoContacto();
    }

    //signUp-Login
    @When("^Selecciono la opcion para crear usuario$")
    public void seleccOpcCrearUsuario() throws InterruptedException {
        tiendaDemoBlaze.CrearUsuario();
    }

    @Then("^Valido que se creeo el usuario correctamente$")
    public void iniciarSesion() throws InterruptedException {
        tiendaDemoBlaze.realizarLogin();
    }

    @And("^Verifico que no se permita registrar un usuario con el mismo username y que no se permita ingresar con credenciales invalidas$")
    public void registroUsrRepLoginInv() throws InterruptedException {
        tiendaDemoBlaze.registroLoginInvalido();
    }


}