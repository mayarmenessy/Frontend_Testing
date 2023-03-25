package org.example.stepdef;

import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;

public class D04_searchStepDef {
    P03_homePage search = new P03_homePage();
    @When("User search for laptop")
    public void x(String productName){
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
        Hooks.driver.findElement(By.cssSelector("button[type=\"submit\"])").click();
    }
}
