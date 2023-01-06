
package automationproyect_v1.pages;

public class GooglePage extends BasePage {
    private String btnSearchGoogle = "//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']";
    private String SearchInputGoogle = "//input[@title='Buscar']";
    private String searchResultOfGoogle = "//div[@id='hdtb-tls']";


    //**sandbox**


    public GooglePage() {
        super(driver);
    }

    public void navigateToGoogle() {
        BasePage.navigateTo("https://www.google.com");
    }

    public void clickBtnSearchGoogle() {
        this.clickElement(this.btnSearchGoogle);
    }

    public void captureSearchCriteria(String criteraToSearch) {
        this.write(this.SearchInputGoogle, criteraToSearch);
    }

    public String resultSearchGoogle() {
        return this.textFromElement(this.searchResultOfGoogle);
    }

    public boolean btnSearchDisplayed() {
        return this.elementIsDisplayed(this.btnSearchGoogle);
    }
}
