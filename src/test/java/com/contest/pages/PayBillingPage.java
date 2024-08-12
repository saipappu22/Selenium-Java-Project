package com.contest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class PayBillingPage extends BasePage {

    public PayBillingPage(WebDriver driver) {
        super(driver);
    }
    public void ClickPayBilling(){
        driver.findElement(By.xpath("//h3/a[text()='Pay Billing']")).click();
    }
    
    public void BillingPage(String custID) throws InterruptedException{
        driver.findElement(By.xpath("//input[@name='customer_id']")).sendKeys(custID);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        String actualText = driver .findElement(By.xpath("//tbody/tr[4]/td[2]")).getText();
        String expectedText = "500";
        Assert.assertEquals(actualText, expectedText);
        System.out.println();
        String totalCost = driver.findElement(By.xpath("//tbody/tr[6]/td[2]")).getText();
        System.out.println(totalCost);
    }
}
