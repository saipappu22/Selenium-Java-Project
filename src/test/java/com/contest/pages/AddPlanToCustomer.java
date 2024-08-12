package com.contest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class AddPlanToCustomer extends BasePage {

    public AddPlanToCustomer(WebDriver driver) {
        super(driver);
        driver.get("https://demo.guru99.com/telecom/index.html");
    }

    public void ClickAddTariffPlanToCustomer(){
        driver.findElement(By.xpath("//h3/a[text()='Add Tariff Plan to Customer']")).click();
    }

    public void AddTariffPlanToCustomer(String custID) throws InterruptedException{
        driver.findElement(By.xpath("//input[@name='customer_id']")).sendKeys(custID);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    
        WebElement hiddenButton = driver.findElement(By.xpath("//label[@for='sele']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",hiddenButton);
        driver.findElement(By.xpath("//input[@value='Add Tariff Plan to Customer']")).click();

        String actualText = driver.findElement(By.xpath("//h2")).getText();
        String expectedText = "Congratulation Tariff Plan assigned";
        Assert.assertEquals(actualText,expectedText);
        System.out.println(actualText);
    }

    public void AddTariffPlanToCustomer1(String custID) throws InterruptedException{
        driver.findElement(By.xpath("//input[@name='customer_id']")).sendKeys(custID);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }

    public void homeButton(){
        driver.findElement(By.xpath("//a[@class='button']")).click();

    }


}
