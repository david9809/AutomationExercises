package pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{
    public MainPage() {
        super(driver);
    }

    public void navigateToFreeRangeTesters(){
        navigateTo("https://www.freerangetesters.com");
    }

}
