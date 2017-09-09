package com.run.page.object;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "feat",
		glue  = {"com.step.page.object","pages"},
		format = {"pretty", "html:target/Destination"}
		)
public class runpageobject {

}
