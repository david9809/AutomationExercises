package pages;

import io.cucumber.java.sl.In;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {

    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    //Bloque estatico que se compila al inicio de la ejecucion
    static{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
    }

    public static void navigateTo(String url){
        driver.get(url);
    }

    public static void closeBrowser(){
        driver.quit();
    }

    private WebElement find (String locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator){
        find(locator).click();
    }

    public void write (String locator, String textToWrite){
        find(locator).clear();
        find(locator).sendKeys(textToWrite);
    }

    public void selectFromDropDownByIndex(String locator, int Index){
        Select dropDown = new Select(find(locator));
        dropDown.selectByIndex(Index);
    }

    public void selectFromDropDownByValue(String locator, String value){
        Select dropDown = new Select(find(locator));
        dropDown.selectByValue(value);
    }

    public int dropDownSize(String locator){
        Select dropDown = new Select(find(locator));
        List<WebElement> dropDownOptions = dropDown.getOptions();
        return dropDownOptions.size();
    }

    public List<String> getValuesFromADropDown(String locator){
        Select dropDown = new Select(find(locator));
        List<WebElement> dropDownValues = dropDown.getOptions();
        List<String> values = new ArrayList<>();
        for (WebElement option : dropDownValues){
            values.add(option.getText());
        }
        return values;
    }

}
