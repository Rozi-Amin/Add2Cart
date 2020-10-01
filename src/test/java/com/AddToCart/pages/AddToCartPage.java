package com.AddToCart.pages;

import org.openqa.selenium.*;

public class AddToCartPage {
    WebDriver driver;

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addQty() {
        driver.findElement(By.xpath("//*[@id=\"md-app\"]/div[1]/div[3]/div[5]/section/div[1]/div/div[1]/div/div[3]/input")).sendKeys("3");
    }

    public void addToCart() {
        driver.findElement(By.className("fa-cart-plus")).click();
    }

    public void clickOnShoppingCart() {
        driver.findElement(By.id("miniCart")).click();
    }

    public void reviewCart() {
        driver.findElement(By.id("review-cart")).click();
    }

    public boolean validateQty() {
        String qty=driver.findElement(By.xpath("//*[@id=\"cart-items\"]/div/div/div[4]/div/div[2]/div[2]/span")).getText();
        System.out.println(qty);
        if(! qty.equals("3"))
            return false;
        return true;
    }

}
