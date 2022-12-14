package com.krafttech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "rerun:target/rerun.txt"},
//"json:target/cucumber.json",
//                "html:target/default-html-reports.html"   html rapor alma için
        features = "src/test/resources/features",
        glue = "com/krafttech/step_definitions",
        dryRun = false,
        tags ="@wip"

)



public class CukesRunner {


}
