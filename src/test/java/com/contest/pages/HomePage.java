package com.contest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        driver.get("https://demo.guru99.com/telecom/index.html");
    }


   // public WebElement AddCustomer = driver.findElement(By.xpath("//h3/a[text()='Add Customer']"));

     public void ClickAddCustomer(){
        driver.findElement(By.xpath("//h3/a[text()='Add Customer']")).click();
    }

    public void addCustomerDetails(String firstname, String lastname, String emailid, String addr, String phoneno){
        driver.findElement(By.xpath("//label[@for='done']")).click();
        driver.findElement(By.xpath("//input[@name='fname']")).sendKeys(firstname);
        driver.findElement(By.xpath("//input[@name='lname']")).sendKeys(lastname);;
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(emailid);
        driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(addr);;
        driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(phoneno);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    public String getCustomerId(){
        String customerId = driver.findElement(By.xpath("//td/h3")).getText();
        return customerId;
        
        
    }

    public void homeButton(){
        driver.findElement(By.xpath("//a[@class='button']")).click();

    }

   
    

    

    


}
