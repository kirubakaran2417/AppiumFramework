package org.example.testrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
   
@CucumberOptions(tags = "", features = {"src\\test\\resources\\features\\Generalstore.feature"}, glue = {"org.example.stepdefinitions"},
                 plugin = {})
public class Cucumberrunnertests extends AbstractTestNGCucumberTests  {

}

   
