package com.contest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class AddTarriffPlanPage extends BasePage {

    public AddTarriffPlanPage(WebDriver driver) {
        super(driver);
        driver.get("https://demo.guru99.com/telecom/index.html");
    }

    // Addmethods here

    public void ClickAddTariffPlan(){
        driver.findElement(By.xpath("//h3/a[text()='Add Tariff Plan']")).click();
    }

    public void TarriffPlanPage(String rental,String local_minutes,String inter_minutes,String sms_pack,String minutes_charges,String inter_charges,String sms_charges){
        driver.findElement(By.xpath("//input[@name='rental']")).sendKeys(rental);
        driver.findElement(By.xpath("//input[@name='local_minutes']")).sendKeys(local_minutes);
        driver.findElement(By.xpath("//input[@name='inter_minutes']")).sendKeys(inter_minutes);
        driver.findElement(By.xpath("//input[@name='sms_pack']")).sendKeys(sms_pack);
        driver.findElement(By.xpath("//input[@name='minutes_charges']")).sendKeys(minutes_charges);
        driver.findElement(By.xpath("//input[@name='inter_charges']")).sendKeys(inter_charges);
        driver.findElement(By.xpath("//input[@name='sms_charges']")).sendKeys(sms_charges);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        String actualText = driver.findElement(By.xpath("//h2")).getText();
        String expectedText = "Congratulation you add Tariff Plan";
        Assert.assertEquals(actualText,expectedText);
        System.out.println(actualText);
    }

    public void homeButton(){
        driver.findElement(By.xpath("//a[@class='button']")).click();

    }

}
