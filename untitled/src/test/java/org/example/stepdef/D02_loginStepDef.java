package org.example.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login =new P02_login();
    @Given("user go to login page")
    public void user_go_to_login_page() {

        login.Loginlink.click();
    }

    @When("user login with {string}")
    public void userLoginWith(String arg0) {
        login.email.sendKeys(arg0);

    }

   @And("user login with password {string}")
    public void userLoginWithAnd(String arg0) {
       login.password.sendKeys(arg0);
   }




   @And("user press on login button")
    public void userPressOnLoginButton() {
       login.button.click();
   }






    @Then("account is created_successfully")
    public void accountIsCreated_successfully() {
           SoftAssert soft=new SoftAssert();
           //1-get text and verify it contains "Your registration completed"
           soft.assertTrue(login.successMessage.isDisplayed());



           soft.assertAll();

       }



}

