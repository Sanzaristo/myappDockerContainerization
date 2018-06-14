package com.khabane.app;

import org.junit.Assert;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ItemSearchTest {

    WebDriver driver;

    @Test
    public void firstSearchResultIsRelatedTest() {

        // This line tells your test where to find the chromedriver, which is the "glue"
        // between Selenium and the Chrome installation on your machine

        // Start a new Chrome browser instance and maximize the browser window
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");
        driver = new ChromeDriver(options);
        //DesiredCapabilities caps = new DesiredCapabilities();
        //caps.setJavascriptEnabled(true);
        //caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "/Users/apple/Downloads/phantomjs-2.1.1-macosx/bin/phantomjs");
        //driver = new PhantomJSDriver();
        //driver.manage().window().maximize();

        // Navigate to the Amazon.com home page
        driver.navigate().to("http://www.khabane.co.za/");
        System.out.println(driver.getCurrentUrl());

        // Type "Software testing" in the search window
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Software Testing");
        driver.findElement(By.cssSelector("#khabane-nav-bar > ul > li:nth-child(4) > a")).click();

        // Click on the search button
        //driver.findElement(By.xpath("//input[@value='Go']")).click();
        driver.findElement(By.id("mce-EMAIL")).sendKeys("ledbodVx@khabane.co.za");

        // Select the first item in the list of search results
        //driver.findElement(By.xpath("(//div[@id='resultsCol']//a[contains(@class,'access-detail-page')])[1]")).click();
        driver.findElement(By.id("mc-embedded-subscribe")).click();

        // Check that the page title contains the term "Software Testing"
        Assert.assertTrue(driver.getTitle().contains("KMC - Thoughts"));
        //Assert.assertTrue("email confirmation you are subscribed", equals("Thank you!"));


        System.out.println("title is: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }

}
