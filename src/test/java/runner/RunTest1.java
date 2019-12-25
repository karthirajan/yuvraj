package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import io.cucumber.junit.Cucumber;


@CucumberOptions(features= "src/test/java/features/Flipkart.feature",
glue= {"steps"},
monochrome=true,
snippets =SnippetType.CAMELCASE)
@RunWith (Cucumber.class)
public class RunTest1
{
}



