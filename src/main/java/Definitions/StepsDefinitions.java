package Definitions;

import Pages.CartPage;
import Pages.Checkout;
import Pages.LoginPage;
import Pages.ProductPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;


public class StepsDefinitions {
    WebDriver driver;
    LoginPage loginPage;
    ProductPage productPage;
   CartPage cartPage;
   Checkout checkout;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        driver.get("https://www.saucedemo.com");
        loginPage = new LoginPage(driver);
    }
    @When("the user logs in with username {string} and password {string}")
    public void the_user_logs_in_with_username_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the Swag Labs logo should be visible")
    public void the_swag_labs_logo_should_be_visible() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("the products page is displayed")
    public void the_products_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user navigates to a product page")
    public void the_user_navigates_to_a_product_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the product name should be visible")
    public void the_product_name_should_be_visible() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("the user adds {int} items to the cart")
    public void the_user_adds_items_to_the_cart(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user navigates to the cart page")
    public void the_user_navigates_to_the_cart_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the cart contains {int} items")
    public void the_cart_contains_items(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user removes an item from the cart")
    public void the_user_removes_an_item_from_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user proceeds to checkout")
    public void the_user_proceeds_to_checkout() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the checkout page is displayed")
    public void the_checkout_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user fills in the required information")
    public void the_user_fills_in_the_required_information() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("the user proceeds to the confirmation page")
    public void the_user_proceeds_to_the_confirmation_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the confirmation page displays the correct items")
    public void the_confirmation_page_displays_the_correct_items() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user logs out")
    public void the_user_logs_out() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the login page should be displayed")
    public void the_login_page_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
