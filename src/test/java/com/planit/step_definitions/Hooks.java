package com.planit.step_definitions;

import com.planit.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void setup(Scenario scenario) {
        System.out.println("::: Starting Automation:::");
    }

    @After
    public void tearDown(Scenario scenario) {
        Driver.closeDriver();
        System.out.println(":::(^_^) End of test execution (*_*):::");
    }
}
