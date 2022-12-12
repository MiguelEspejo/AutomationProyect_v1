package automationproyect_v1.pages;

import java.time.Duration;

import org.junit.internal.runners.statements.ExpectException;
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
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
         wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static void navigateTo(String url){
        driver.get(url);
    }

    private WebElement Find(String locator) {
        //only xpath (major practice and standar for all pages)
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));

    }

    public void clickElement(String locator){
        Find(locator).click();
    }

    public void write(String locator, String textToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    //selects
    public void selectDropdownValue(String locator, String valueToSelect){
        Select dropdown = new Select (Find(locator));
        dropdown.selectByValue(valueToSelect);
    }

    public void selectDropdownText(String locator, String textToSelect){
        Select dropdown = new Select (Find(locator));
        dropdown.selectByVisibleText(textToSelect);
    }

    public void selectDropdownIndex(String locator, int indexToSelect){
        Select dropdown = new Select (Find(locator));
        dropdown.selectByIndex(indexToSelect);
    }

    //actions
    public void hoverOverElement(String locator){
        action.moveToElement(Find(locator));
    }

    public void doubleClick(String locator){
        action.doubleClick(Find(locator));
    }

    public void rightClick(String locator){
        action.contextClick(Find(locator));
    }
   

}   