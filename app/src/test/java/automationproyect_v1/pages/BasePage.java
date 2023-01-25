//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package automationproyect_v1.pages;

import java.sql.Driver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;

    static {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Miguel Espejo/Documents/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        driver.manage().window().maximize();
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15L));
    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    public static void closeBrowser() {
        driver.quit();
    }


    private WebElement Find(String locator) {
        return (WebElement)wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator) {
        this.Find(locator).click();
    }

    public void write(String locator, String textToWrite) {
        this.Find(locator).clear();
        this.Find(locator).sendKeys(new CharSequence[]{textToWrite});
    }

    public void selectDropdownValue(String locator, String valueToSelect) {
        Select dropdown = new Select(this.Find(locator));
        dropdown.selectByValue(valueToSelect);
    }

    public void selectDropdownText(String locator, String textToSelect) {
        Select dropdown = new Select(this.Find(locator));
        dropdown.selectByVisibleText(textToSelect);
    }

    public void selectDropdownIndex(String locator, int indexToSelect) {
        Select dropdown = new Select(this.Find(locator));
        dropdown.selectByIndex(indexToSelect);
    }

    public void hoverOverElement(String locator) {
        action.moveToElement(this.Find(locator));
    }

    public void doubleClick(String locator) {
        action.doubleClick(this.Find(locator));
    }

    public void rightClick(String locator) {
        action.contextClick(this.Find(locator));
    }

    public void swtichToFrame(int iFrameIndex) {
        driver.switchTo().frame(iFrameIndex);
    }

    public void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }
    public void acceptAlert() throws InterruptedException {
        Thread.sleep(2000); //cambiar por otra espera optima
        driver.switchTo().alert().accept();
    }
    public String obtenerTextoAlerta() throws InterruptedException {
        Thread.sleep(2000); //cambiar por otra espera optima
        return driver.switchTo().alert().getText();
    }

    public String textFromElement(String locator) {
        return this.Find(locator).getText();
    }

    public boolean elementIsDisplayed(String locator) {
        return this.Find(locator).isDisplayed();
    }

    public boolean elementIsEnabled(String locator) {
        return this.Find(locator).isEnabled();
    }

    public boolean elementIsSelected(String locator) {
        return this.Find(locator).isSelected();
    }

}
