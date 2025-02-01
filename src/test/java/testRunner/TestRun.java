package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
  	features = {".//features/login.feature"} - to run one specific feature file
  	glue = "stepsDefinitions"	-- just provide package name
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {".//features"}, glue = "stepsDefinitions")
public class TestRun {

}
