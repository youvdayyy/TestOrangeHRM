package com.juaracoding.cucumber.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {"src/test/resources/features/01.Login.feature",
               // "src/main/resources/features/02.Dashboard.feature",
                "src/test/resources/features/02.Recruitment.feature"},
        glue = "com.juaracoding.cucumber.step_definitions",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {
	//{"src/main/resources/features/01.Login.feature",
        //"src/main/resources/features/02.Dashboard.feature",
       // "src/main/resources/features/03.Recruitment.feature"},
}
