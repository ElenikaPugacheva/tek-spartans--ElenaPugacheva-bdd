package tek.bdd.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "tek.bdd.steps",
        dryRun = false, // set to true to scan feature for unimplemented steps
        tags = "@UserStory1",
        plugin = {
                "html:target/cucumber_report/index.html"
        }
)
public class TestRunner {
}
//Running multiple tags => tags = "@Smoke or @Regression"