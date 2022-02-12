package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "steps",
        tags = "@Blog or @Feedback or @Sales or @FindItem or @Gift")
//        tags = "@Blog or @Feedback")
public class RunnerTest {}
