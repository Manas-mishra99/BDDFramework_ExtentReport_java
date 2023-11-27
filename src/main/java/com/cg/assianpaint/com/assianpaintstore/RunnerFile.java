package com.cg.assianpaint.com.assianpaintstore;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
//import Reporter;
import io.cucumber.junit.CucumberOptions;
import  io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/FeatureFile",
        glue = {"com.stepDefination","com.utils"},
        plugin = {"pretty","json:target/cucumber-reports/Cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml",
        "html:target/cucumber-reports/cucumber.html",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        tags = "@firstTest"
)
public class RunnerFile {

    //"html:target/cucumber-reports","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
    @AfterClass
    public static void setup() {
        //Reporter.loadXMLConfig(new File("/Configs/extent-config"));
        //Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
//        Reporter.setSystemInfo("User Name", "Muhammed Saleeq");
//        Reporter.setSystemInfo("Application Name", "Trip Advisor ");
//        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
//        Reporter.setSystemInfo("Environment", "Production");
//        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
    }


}
