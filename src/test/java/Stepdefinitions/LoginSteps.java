package Stepdefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
	WebDriver driver;
    LoginPage loginPage;

    @Given("user is on the login page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_credentials(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("user should be redirected to the homepage")
    public void user_should_be_redirected() {
        assertTrue(loginPage.isLoginSuccessful());
        driver.quit();
    }
}
