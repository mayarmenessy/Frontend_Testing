package org.example.stepdef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_RedstepDef {
    P01_register register = new P01_register();

    @Given("user go to register page")
    public void user_go_to_register_page() {
        register.registerLink.click();
    }

    @When("user select gender type")
    public void userSelectGenderType() {
        register.male.click();
    }

    @And("user enter {string} & {string}")
    public void userEnter(String firstname, String lastname) {
        register.firstname.sendKeys(firstname);
        register.lastname.sendKeys(lastname);
    }

    @And("user select date of birth")
    public void userSelectDateOfBirth() {
        //select Day
        Select selectDay = new Select(register.daylist);
        selectDay.selectByValue("1");

        //select Month
        Select selectMonth = new Select(register.monthlist);
        selectMonth.selectByValue("3");

        //select year
        Select selectYear = new Select(register.yearlist);
        selectYear.selectByValue("2004");

    }

    @And("user enter email")
    public void userEnter() {
        // generate random email using java faker
        Faker fake = new Faker();
        String emailAddress = fake.internet().safeEmailAddress();
        System.out.println(emailAddress);
        register.Email.sendKeys(emailAddress);

    }

    @And("user enter {string} password and confirm password")
    public void userEnterPasswordAndConfirmPassword(String arg0) {
        register.password.sendKeys(arg0);
        register.confirmpassword.sendKeys(arg0);
    }

    @And("user click on register button")
    public void userClickOnRegisterButton() {
        register.regesterButton.click();
    }


    @Then("account is created successfully")
    public void accountIsCreatedsuccessfully() {
        SoftAssert soft = new SoftAssert();
        //1-get text and verify it contains "Your registration completed"
        soft.assertTrue(register.successMessage.isDisplayed());


        soft.assertAll();

    }
}