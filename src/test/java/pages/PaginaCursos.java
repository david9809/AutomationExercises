package pages;

public class PaginaCursos extends BasePage{

    private String courseName = "//h2[normalize-space()='Fundamentos del Testing']";
    public PaginaCursos() {
        super(driver);
    }

    public void clickFundamentosTesting(){
        clickElement(courseName);
    }

}
