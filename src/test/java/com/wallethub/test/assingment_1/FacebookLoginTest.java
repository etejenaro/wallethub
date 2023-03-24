package com.wallethub.test.assingment_1;

import com.wallethub.page.LoginPage;
import com.wallethub.test.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookLoginTest extends TestBase {


    @Test
    public void facebookLogin()  {


        driver.get("https://www.facebook.com/");

        LoginPage loginPage=new LoginPage();

        loginPage.login("tugba.ulusoy72@gmail.com","213885");

        wait.until(ExpectedConditions.visibilityOf(loginPage.imgFB));

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/?sk=welcome","Hello World");


    }



}
