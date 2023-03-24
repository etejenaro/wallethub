package com.wallethub.test;

import com.wallethub.utility.ConfigurationReader;
import com.wallethub.utility.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {


    protected WebDriver driver;
    protected WebDriverWait wait;
    protected  String url;

    // execute before each test
    @BeforeMethod
    public void setUp() {


        driver = Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        wait=new WebDriverWait(driver,10);

       // driver.get(url);
    }

    @AfterMethod
    public void afterMethod(ITestResult result) throws InterruptedException {

        Thread.sleep(2000);

        Driver.closeDriver();
        //  driver.quit();
    }
}



