package com.utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import com.utils.ConfigFileReader;
import com.utils.WebdriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass extends WebdriverManager {


    public BaseClass (WebDriver driver){
        WebdriverManager.driver = driver;
        PageFactory.initElements(driver, this);

    }




    ConfigFileReader WM = new ConfigFileReader ();


    public void OpenApp(){

    }


    public void fn_OpenURL(){
        try {

            String URL = WM.getApplicationUrl();
            System.out.println(URL);
            driver.get(URL);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


    }
    public void EnterText(WebElement el, String txt){
        try {

            WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(el));
            el.sendKeys(txt);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


    }
    public void ClickElement(WebElement el){
        try {

            WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(el));
            el.click();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


    }

    public void SwitchToCurrentWindow(String Window){
        try {
            Thread.sleep(2000);
            for(String winHandle : driver.getWindowHandles()){
                driver.switchTo().window(winHandle).getTitle().equals(Window);
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


    }

    public void WaitTillElementisVisible(WebElement el){
        try {
            WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(el));


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


    }


}
