package org.example.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homePage curr = new P03_homePage();

    @When("user select currencies Eru from home page")
    public void Currencies(String arg){new Select(this.curr.list).selectByVisibleText(arg);}


    @Then("assertion to verify {string} Symbol on products")
    public void assertionToVerifySymbolOnProducts(String arg0) {
    for(int i=0;i<4;i++){
        Assert.assertTrue(((WebElement)Hooks.driver.findElements(By.className("prices")).get(i)).getText().contains(arg0));
        Assert.assertTrue(((WebElement)this.curr.products.get(i)).getText().contains(arg0));
    }
    }
}


