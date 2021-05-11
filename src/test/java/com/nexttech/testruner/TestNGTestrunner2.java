package com.nexttech.testruner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= {"Features"}, 
	    glue = {"stepdef"},
		tags = {"@login_Pos"}
			)
public class TestNGTestrunner2 extends AbstractTestNGCucumberTests{

}
