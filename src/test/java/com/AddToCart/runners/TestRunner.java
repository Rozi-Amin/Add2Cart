package com.AddToCart.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

//        plugin = {
//                "json:target/cucumber.json",
//                "html:target/default-cucumber-reports",
//                "rerun:target/rerun.txt"
//        },
//        tags = {"@negative or @storemanager"},Cucumber\src\test\java\com\AddToCart\step_definitions
        features = {"src\\test\\resources\\Features\\AddToCart\\AddToCart.Feature" //to specify where are the features
},

        glue = {"com/AddToCart/step_definitions/TestSteps"},
        //dry run - to generate step definitions automatically
        //you will see them in the console output
        dryRun = false

)


public class TestRunner {


}
