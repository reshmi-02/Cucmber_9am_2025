package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "./src/test/resources/FeatureFile/Orangehrm.feature",
			glue = "org.test",
			publish=true,
			plugin = { "pretty","html:target/output.html","junit:target/output.xml",
					"rerun:target/failedScenarios.txt"},
			dryRun = false
		)




public class TestRunner {
	
	
}
