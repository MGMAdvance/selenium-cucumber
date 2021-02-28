package steps.basics;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class BasicTestsSteps {
    private Integer contador;

    @Given("que eu inicializei com {int}")
    public void queEuInicializeiCom(Integer num) {
        contador = num;
    }

    @Given("acrescento mais {int}")
    public void acrescentoMais(Integer num) {
        contador += num;
    }

    @Then("fico com {int}")
    public void ficoCom(Integer num) {
        Assert.assertEquals(num, contador);
    }
}
