package starter;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/feature/BuyProduct.feature",
        tags = "@ProductViaSearch"
)
public class
TestSuite {

}
