package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //path of feature file
        features = "src/test/java/features/Login.feature",
        //path of step definition file
        glue = "steps",
        dryRun = true,
        plugin = { "pretty" ,"html:target/cucumber-reports"},
        monochrome = true
)
public class LoginRunnerClass {
}
