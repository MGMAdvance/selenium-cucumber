package steps.basics;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class RegexTestsSteps {
    private Integer ingressosValidos = 0;

    @Given("que meu ingresso é (\\d+)$")
    public void queMeuIngressoE(Integer ticket) {
        if(ticket > 999){
            ingressosValidos += 1;
        }
    }

    @Then("tenho {int} ingresso válido")
    public void tenhoIngressoValido(Integer tickets) {
        Assert.assertEquals(tickets, ingressosValidos);
    }
}
