package testRun;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(

		features = { "C:/Users/sgrch/eclipse-workspaceForSelenium/Cuc_BDD_Gmail/src/test/java/features" },

//		dryRun = true,
		
		snippets = SnippetType.CAMELCASE,
		
		monochrome = true,
		
		glue = {"steps"},
		
		plugin = {"pretty", "html:target/TestReports.html"}
		
//		tags = "To run specific scenario depending upon tags given"

)

public class TestRunner extends AbstractTestNGCucumberTests {

}
