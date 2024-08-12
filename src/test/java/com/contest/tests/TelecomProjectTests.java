package com.contest.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.contest.pages.AddPlanToCustomer;
import com.contest.pages.AddTarriffPlanPage;
import com.contest.pages.HomePage;
import com.contest.pages.PayBillingPage;

public class TelecomProjectTests extends BaseTest {

    public String customerId;

    @Test
    public void addCustomerTest() throws InterruptedException {
        
        HomePage homepage = new HomePage(driver);
        // String originalWindowHandle = driver.getWindowHandle();
        // driver.switchTo().window(originalWindowHandle);
        // Thread.sleep(10000);
        homepage.ClickAddCustomer();
        homepage.addCustomerDetails("John","Doe","john.doe@example.com","123 Main St Anytown USA","1234567890");
        customerId = homepage.getCustomerId();
        System.out.println(customerId);
        homepage.homeButton();        

    }

    @Test
    public void addTarrifPlanTest() throws InterruptedException {
        AddTarriffPlanPage addTarriffPage = new AddTarriffPlanPage(driver);
        HomePage homepage1 = new HomePage(driver);
        addTarriffPage.ClickAddTariffPlan();
        addTarriffPage.TarriffPlanPage("49", "1000", "100", "500", "0", "1", "1");
        addTarriffPage.homeButton();
        homepage1.ClickAddCustomer();
        homepage1.addCustomerDetails("Jane","Smith"," jane.smith@example.com","456 Elm St Othertown USA","9876543210");
        customerId = homepage1.getCustomerId();
        System.out.println(customerId);
        homepage1.homeButton(); 
        
        AddPlanToCustomer addPlanToCustomer1 = new AddPlanToCustomer(driver);
        addPlanToCustomer1.ClickAddTariffPlanToCustomer();
        addPlanToCustomer1.AddTariffPlanToCustomer1(customerId);
        

        

    }

    @Test
    public void addTarrifPlanToCustomerTest() throws InterruptedException {
        addCustomerTest();
        AddPlanToCustomer addPlanToCustomer = new AddPlanToCustomer(driver);
        addPlanToCustomer.ClickAddTariffPlanToCustomer();
        addPlanToCustomer.AddTariffPlanToCustomer(customerId);
        addPlanToCustomer.homeButton();




    }

    @Test
    public void payBillingTest() throws InterruptedException {
        addTarrifPlanToCustomerTest();
        PayBillingPage billingPage = new PayBillingPage(driver);
        billingPage.ClickPayBilling();
        billingPage.BillingPage(customerId);


    }
}
