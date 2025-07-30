package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
			features = "@target/failedScenarios.txt",
			glue = "org.test",
			publish=true
		)

public class ReRun {

}
