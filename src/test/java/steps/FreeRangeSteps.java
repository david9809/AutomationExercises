
package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CheckoutPage;
import pages.MainPage;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;

import java.util.Arrays;
import java.util.List;

public class FreeRangeSteps {

    MainPage landingPage = new MainPage();
    PaginaCursos cursos =  new PaginaCursos();
    PaginaFundamentosTesting fundamentos = new PaginaFundamentosTesting();

    CheckoutPage listaPlanes = new CheckoutPage();

    @Given("I navigate to Free Range Testers web page")
    public void iNavigateToFreeRangeTesters(){
        landingPage.navigateToFreeRangeTesters();
    }

    @When("I select Elegir Plan")
    public void iDecidedToSelectAPlan(){
        landingPage.clickSelectPlanOption();
    }

    @Then("I can validate the options in the checkout page")
    public void validatePlans(){
        List<String> resultado =  listaPlanes.planValues();
        List<String> esperado = Arrays.asList("Academia: $16.99 / mes • 11 productos", "Academia: $176 / año • 11 productos", "Free: Gratis • 1 producto");
        System.out.println("Resultado esperado: " + esperado.get(0));
        System.out.println("Resultado Pagina: " + resultado.get(0));
        Assert.assertEquals(resultado, esperado);
    }

}
