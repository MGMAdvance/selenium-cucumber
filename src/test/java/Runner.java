import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        dryRun = false,
        tags = "@Funcionalidades",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {

}
