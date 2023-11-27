package com.utils;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.utils.WebdriverManager.driver;

public class Hooks {
    WebdriverManager wb = new WebdriverManager();

    @Before
    public void BeforeSteps() {
        wb.getDriver();

    }

    @AfterStep()
    public void attachScreenshot(Scenario scenario) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

    }

    @After
    public void AfterSteps() {
        wb.closeDriver();
    }

}

