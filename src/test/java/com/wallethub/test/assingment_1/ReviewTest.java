package com.wallethub.test.assingment_1;

import com.wallethub.page.LoginPage;
import com.wallethub.test.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReviewTest extends TestBase {

    //updated from github
    
   // update from github 2
    
    @Test
    public void reviewConfirmTest()  {


        driver.get("https://wallethub.com/join/login");

        LoginPage loginPage=new LoginPage();

       // loginPage.login("tugba.ulusoy72@gmail.com","213885");

        //wait.until(ExpectedConditions.visibilityOf(loginPage.imgFB));

       // Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/?sk=welcome","Hello World");


    }
}
