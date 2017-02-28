package tutorials.bdd.tacos;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//Included the path and plug-in so that it would be runnable from Intellij.
@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources"},
        plugin = {"pretty"} )
    public class CukesRunner {
}