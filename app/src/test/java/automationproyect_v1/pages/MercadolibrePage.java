package automationproyect_v1.pages;


public class MercadolibrePage extends BasePage{

    public MercadolibrePage() {
        super(driver);
    }

    public void navigateToGoogle() {
        BasePage.navigateTo("https://www.mercadolibre.com.mx/");
    }

    
    
}
