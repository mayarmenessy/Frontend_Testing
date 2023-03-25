package org.example.pages;

import org.example.stepdef.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login {
    public P02_login()
    {
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(className = "ico-login")
    public WebElement Loginlink;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(name = "Password")
    public WebElement password;



   @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
      public WebElement button;

    @FindBy(linkText = "/customer/info")
    public WebElement successMessage;





}
