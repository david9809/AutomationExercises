package pages;

public class MainPage extends BasePage{

    private String classOption = "//a[normalize-space()='%s' and @href]";
    private String selectPlanButton = "//a[normalize-space()='Elegir Plan' and @href]";
    public MainPage() {
        super(driver);
    }

    public void navigateToFreeRangeTesters(){
        navigateTo("https://www.freerangetesters.com");
    }

    public void clickClassesOption(String section){
        String xpathSection = String.format(classOption, section);
        clickElement(xpathSection);
    }

    public void clickSelectPlanOption(){
        clickElement(selectPlanButton);
    }

}
