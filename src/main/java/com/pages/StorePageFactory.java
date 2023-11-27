package com.pages;

import io.cucumber.java.de.Wenn;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.BaseClass;
public class StorePageFactory extends BaseClass {
    public  StorePageFactory (){
        super(driver);
    }

    @FindBy(xpath= "//a[contains(@class,'close_btn')]")
    WebElement closeAdviosrPopUp;
    @FindBy(xpath= "(//div[contains(@class,'active-exit-popup')])[1]")
    WebElement activeAdviosrPopUp;
    public void CLosePopup () {
        try {

            this.SwitchToCurrentWindow("");
            this.WaitTillElementisVisible(activeAdviosrPopUp);
            this.ClickElement(closeAdviosrPopUp);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    @FindBy(xpath = "//img[@title='asian-paint-logo']")
    WebElement asianpainLogo;

    public void VerifyHotelWebsite () {
        try {


            this.WaitTillElementisVisible(asianpainLogo);
            Assert.assertTrue(asianpainLogo.isDisplayed());

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void launchHomePage () {
        try {

            //this.OpenApp();
            this.fn_OpenURL();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    @FindBy(xpath= "//span[@class='visible-desktop']/span[text()='Find A Store']")
    WebElement findAStore;
    public void navigateToStore(){
        WaitTillElementisVisible(findAStore);
        findAStore.click();

    }
    @FindBy(id="navPincode_Field")
    WebElement pincodeField;
    @FindBy(xpath = "//h3[text()='Pincode']//following::button[1]")
    WebElement searchPincode;
    public void enterPincode(String pincode) throws InterruptedException {
        WaitTillElementisVisible(pincodeField);
        pincodeField.sendKeys(pincode);
        ClickElement(searchPincode);
        Thread.sleep(3000);

    }
    @FindBy(xpath = "//a[text()='SEE ALL']")
    WebElement seeAll;
    public void clickSeeAll(){
        ClickElement(seeAll);
    }



}
