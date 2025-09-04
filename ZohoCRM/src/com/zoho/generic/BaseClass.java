package com.zoho.generic;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.zoho.pom.HomePage;
import com.zoho.pom.LoginPage;

public class BaseClass{
 
	public static WebDriver driver;
    

    @BeforeTest
    public void openBrowser() throws IOException, InterruptedException, InvalidFormatException {
    	ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Filelib li = new Filelib();
        String url = li.getPropertyData("url");
        Thread.sleep(2000);
        driver.get(url);
    }
    
   
    @BeforeMethod
    public void zohoLogin() throws IOException, AWTException, InterruptedException, InvalidFormatException {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    Filelib li = new Filelib();
    String un = li.getPropertyData("un");
    String pw = li.getPropertyData("pwd");
    LoginPage lp=new LoginPage(driver);
    lp.getUnTbx().sendKeys(un);
    lp.getPwTbx().sendKeys(pw);
    lp.getSaveBtn().click();
    
    }
    
    @AfterMethod
    public void zohoLogout() throws InterruptedException {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    HomePage hp=new HomePage(driver);
    hp.getLoBtn().click();
    }
    
    @AfterTest
    public void closeBrowser() {
    driver.close();
    }
    
}