package com.wallethub.page;

import com.wallethub.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

 public LoginPage(){ PageFactory.initElements(Driver.get(),this);}

    @FindBy(css ="#email")
    public WebElement inputUsername;

    @FindBy(css ="#pass")
    public WebElement inputPassword;

    @FindBy(name="login")
    public WebElement btnLogin;

    @FindBy(css=".xe3v8dz")
    public WebElement imgFB;





    public void login(String userEmail, String password) {

        inputUsername.sendKeys(userEmail);
        inputPassword.sendKeys(password);
        btnLogin.click();

    }

}
