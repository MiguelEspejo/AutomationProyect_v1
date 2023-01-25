package automationproyect_v1.pages;


import org.junit.Assert;



public class DemoblazePage extends BasePage {

    private String locPrimerResultado = "//body/div[@id='contcont']/div[1]/div[2]/div[1]/div[1]/div[1]";
    private String locSegundoResultado = "//body/div[@id='contcont']/div[1]/div[2]/div[1]/div[2]/div[1]";
    private String locBtnAgregarCarrito = "//a[contains(text(),'Add to cart')]";
    private String locEnlaceHome = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]";
    private String locElaceCart = "//a[@id='cartur']";
    private String locBtnPlaceOrder = "//button[contains(text(),'Place Order')]";
    private String locInputName = "//input[@id='name']";
    private String locInputContry ="//input[@id='country']";
    private String locInputCity ="//input[@id='city']";
    private String locInputCard ="//input[@id='card']";
    private String locInputMonth ="//input[@id='month']";
    private String locInputYear ="//input[@id='year']";
    private String locBtnPurchase ="//button[contains(text(),'Purchase')]";
    private String locCompraFinalizada = "//h2[contains(text(),'Thank you for your purchase!')]";
    private String locTotalCarrito = "//h3[@id='totalp']";
    private String locTotalModal = "//label[@id='totalm']";
    private String locBtnOk = "//button[contains(text(),'OK')]";
    private String locEnlaceCategoria = "//a[contains(text(),'Laptops')]";
    private String locEnlaceDelete = "//a[contains(text(),'Delete')]";
    private String locBtnCancelar = "//body/div[@id='orderModal']/div[1]/div[1]/div[3]/button[1]";

    private String locEnlaceContact = "//a[contains(text(),'Contact')]";
    private String locInputContact = "//input[@id='recipient-email']";
    private String locInputContactName = "//input[@id='recipient-name']";
    private String locInputMenssage = "//textarea[@id='message-text']";
    private String locBtnSendMenssage = "//button[contains(text(),'Send message')]";
    private String locEnlaceSignUp = "//a[@id='signin2']";
    private String locInputUserName = "//input[@id='sign-username']";
    private String locInputPassword = "//input[@id='sign-password']";
    private String locBtnSignUp = "//button[contains(text(),'Sign up')]";
    private String locBtnSignUpClose = "//body/div[@id='signInModal']/div[1]/div[1]/div[3]/button[1]";
    private String locEnlaceLogIn = "//a[@id='login2']";
    private String locInputLoginUser = "//input[@id='loginusername']";
    private String locInputLoginPassword = "//input[@id='loginpassword']";
    private String locBtnSignIn = "//button[contains(text(),'Log in')]";
    private String locNomUsrLogin = "//a[@id='nameofuser']";

    private String usuarioRandom;





    public DemoblazePage() {
        super(driver);
    }

    public void navigateToDemoBlaze() {
        BasePage.navigateTo("https://www.demoblaze.com/index.html");
    }

    public void selectArcticulos() throws InterruptedException {
        this.clickElement(this.locPrimerResultado);
        this.clickElement(this.locBtnAgregarCarrito);
        this.acceptAlert();
        this.clickElement(this.locEnlaceHome);
        this.clickElement(this.locSegundoResultado);
        this.clickElement(this.locBtnAgregarCarrito);
        this.acceptAlert();
        this.clickElement(this.locEnlaceHome);
    }
    public void terminarCompra() throws InterruptedException {
        this.clickElement(this.locElaceCart);
        this.clickElement(this.locBtnPlaceOrder);
        this.write(this.locInputName,"Jose Perez");
        this.write(this.locInputContry,"CDMX");
        this.write(this.locInputCity,"Mexico");
        this.write(this.locInputCard,"4512 4512 4512 4512");
        this.write(this.locInputMonth,"05");
        this.write(this.locInputYear,"25");
        this.clickElement(this.locBtnPurchase);
        Assert.assertEquals("El Total mostrado en carrito es incorrecto ","1180", textFromElement(locTotalCarrito));
        Assert.assertEquals("El Total mostrado en la modal es incorrecto ","Total: 1180", textFromElement(locTotalModal));
        Assert.assertEquals("La compra no se Finalizo correctamente ","Thank you for your purchase!", textFromElement(locCompraFinalizada));
        Thread.sleep(2000); //quitar el sleep
        this.clickElement(this.locBtnOk);
    }

    //eliminar productos del carrito
    public void selectArcticulosEliminar() throws InterruptedException {
        this.clickElement(this.locEnlaceCategoria);
        this.clickElement(this.locPrimerResultado);
        this.clickElement(this.locBtnAgregarCarrito);
        this.acceptAlert();
        this.clickElement(this.locEnlaceHome);
    }
    public void eliminarProdCarrito() throws InterruptedException {
        this.clickElement(this.locElaceCart);
        this.clickElement(this.locEnlaceDelete);
        Thread.sleep(2000); //quitar el sleep
        this.clickElement(this.locBtnPlaceOrder);
        Assert.assertEquals("El Total mostrado en la modal es incorrecto ","Total:", textFromElement(locTotalModal));
        Thread.sleep(2000); //quitar el sleep
        this.clickElement(this.locBtnCancelar);
    }

    //envio mensaje de contacto
    public void selecionarContacto() throws InterruptedException {
        this.clickElement(this.locEnlaceContact);

    }
    public void capturaInfoContacto() throws InterruptedException {
        this.write(this.locInputContact,"RobertoM@gmail.com");
        this.write(this.locInputContactName,"Roberto Martinez");
        this.write(this.locInputMenssage,"Mensaje de contacto demo");
        this.clickElement(this.locBtnSendMenssage);
        this.acceptAlert();
    }

    //SignUp-Login
    public void CrearUsuario() throws InterruptedException {
        int numRandom = (int)(Math.random()*100+1);
        this.clickElement(this.locEnlaceSignUp);
        usuarioRandom = "UsuLop3z"+numRandom;
        this.write(this.locInputUserName,usuarioRandom);
        this.write(this.locInputPassword ,"123456");
        this.clickElement(this.locBtnSignUp);
        this.acceptAlert();

    }
    public void realizarLogin() throws InterruptedException {
        this.clickElement(this.locEnlaceLogIn);
        this.write(this.locInputLoginUser,usuarioRandom);
        this.write(this.locInputLoginPassword,"123456");
        this.clickElement(this.locBtnSignIn);
        Assert.assertEquals("No se inicio sesión correctamente con el usuario capturado ","Welcome "+usuarioRandom.toString(), textFromElement(locNomUsrLogin));

    }


}
