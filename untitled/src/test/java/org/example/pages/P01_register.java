package org.example.pages;

import org.example.stepdef.Hooks;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
public class P01_register {
    //1-Constructor method
    public P01_register()
    {
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(className ="ico-register" )
     public WebElement registerLink;

    @FindBy(id = "gender-male")
    public WebElement male;

    @FindBy(id="FirstName")
    public WebElement firstname;

    @FindBy(id="LastName")
    public WebElement lastname;

    @FindBy(name = "DateOfBirthDay")
    public WebElement daylist;

    @FindBy(name = "DateOfBirthMonth")
    public WebElement monthlist;

    @FindBy(name = "DateOfBirthYear")
    public WebElement yearlist;

    @FindBy(id = "Email")
    public WebElement Email;

    @FindBy(id="Password")
    public WebElement password;

    @FindAll({
            @FindBy(id="ConfirmPassword"),
            @FindBy(name = "ConfirmPassword")
    })
    public WebElement confirmpassword;

    @FindBy(id="register-button")
    public WebElement regesterButton;

    @FindBy(className = "result")
    public WebElement successMessage;


    /*
    public WebElement registerLink(){
        WebElement register= Hooks.driver.findElement(By.className("ico-register"));
        return register;
    }*/
}
