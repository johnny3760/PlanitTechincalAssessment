package com.planit.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "timeline:target/timeline-report"
        }, // here is to generate very nice and human readable report
        features = {
                "src/test/resources/features"
        },
        glue = "com/planit/step_definitions",
        dryRun = false,
        tags = "@Add_cart",
        publish = true
)
public class CucumberRunner {
}
