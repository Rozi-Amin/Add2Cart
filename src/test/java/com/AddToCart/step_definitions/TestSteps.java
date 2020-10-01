package com.AddToCart.step_definitions;

import com.AddToCart.pages.AddToCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestSteps {

     WebDriver driver=null;
    AddToCartPage page;

    @Given("open home page")
    public void open_home_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rozi_\\chrome\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.microchipdirect.com");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        assert driver.getTitle().equals("Welcome to Microchip Technology");
    }

    @When("user enter qty in text box of the item")
    public void clicks_on_Qty_text_box() {
        page=new AddToCartPage(driver);
        page.addQty();

    }

    @And("click add to cart btn")
    public void click_add_to_cart_btn() {
        page=new AddToCartPage(driver);
        page.addToCart();
    }

    @And("click on shopping cart")
    public void click_shopping_cart() {
        page=new AddToCartPage(driver);
        page.clickOnShoppingCart();
    }

    @Then("click on Review Cart btn")
    public void click_on_Review_Cart_btn() {
        page=new AddToCartPage(driver);
        page.reviewCart();
    }

    @Then("validate Quantity")
    public void validate_Quantity() {
        page=new AddToCartPage(driver);
        page.validateQty();
    }

    @And("close window")
    public void close_window() {
       driver.close();
    }

}
