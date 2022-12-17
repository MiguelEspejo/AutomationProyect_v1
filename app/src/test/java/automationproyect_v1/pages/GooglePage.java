package automationproyect_v1.pages;



public class GooglePage extends BasePage {

    private String btnSearchGoogle = "//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']";
    //maybe bug with search with browser is in english
    private String SearchInputGoogle = "//input[@title='Buscarrr']";
    private String searchResultOfGoogle = "//div[@id='hdtb-tls']";



    public GooglePage() {
        super(driver);
    }

    public void navigateToGoogle(){
        BasePage.navigateTo("https://www.google.com");
    }

    public void clickBtnSearchGoogle(){
        clickElement(btnSearchGoogle);
    }
    
    public void captureSearchCriteria(String criteraToSearch){
        write(SearchInputGoogle,criteraToSearch);
    }   

    public String resultSearchGoogle(){
        return textFromElement(searchResultOfGoogle);
    }

    public boolean btnSearchDisplayed(){
        return elementIsDisplayed(btnSearchGoogle);
    }

    


}
