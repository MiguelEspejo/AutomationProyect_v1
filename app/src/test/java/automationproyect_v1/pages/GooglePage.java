package automationproyect_v1.pages;



public class GooglePage extends BasePage {

    public GooglePage() {
        super(driver);
    }

    public void navigateToGoogle(){
        BasePage.navigateTo("https://www.google.com");
    }
    
}
