package org.example.pages;

import org.example.stepdef.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P03_homePage {
    public P03_homePage() {PageFactory.initElements(Hooks.driver,this);}

    @FindBy(id = "customerCurrency")
    public WebElement list;

   @FindBy(className = "prices")
    public List<WebElement> products;


}
