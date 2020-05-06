package com.stepdefintion;

import java.util.Date;

import org.baseclass.UtilityClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends UtilityClass {
	@Before
	public void before() {
	System.out.println("before Scenario");
	Date d=new Date();
	System.out.println("starting time " +d);
	launchBrowser();
	windowMax();
	impWaitSec(15);
	
	}
	@After 
	public void after() {
		System.out.println("end of the scenario");
		Date d=new Date();
		System.out.println("Ending time " +d);
	}

}
