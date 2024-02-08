package pages;

public class MainPage extends BasePage{

    public String classOption = "//nav[@aria-label='Main']//a[@class='sc-iqHXzD bOSpzC sc-crrtmM sc-dFJsne jBPSqi cBBApE'][normalize-space()='Cursos']";
    public MainPage() {
        super(driver);
    }

    public void navigateToFreeRangeTesters(){
        navigateTo("https://www.freerangetesters.com");
    }

    public void clickClassesOption(){
        clickElement(classOption);
    }

}
