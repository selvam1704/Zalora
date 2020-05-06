package com.testrunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Feature\\Zalora.feature"},glue= {"com.stepdefintion"},monochrome=true,dryRun=false,strict=true,plugin= {"html:Report"})
public class TestRunner {

}
