package com.mikepn.selenium.base;

import com.mikepn.selenium.pages.HomePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import static com.mikepn.selenium.base.BasePage.delay;
import static com.mikepn.selenium.utils.Util.setUtilDriver;

public class BaseTest {

    private WebDriver driver;
    private BasePage basePage;
    protected HomePage homePage;
    private String BASE_URL ="https://demoqa.com/";


    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }



    @BeforeMethod
    public void loadApplication(){
        driver.get(BASE_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilDriver();
        homePage = new HomePage();
    }


    @AfterMethod
    public void takeFailedResultScreenshot(ITestResult testResult){
       if(ITestResult.FAILURE == testResult.getStatus()){
           TakesScreenshot screenshot = (TakesScreenshot) driver;
           File source = screenshot.getScreenshotAs(OutputType.FILE);
           File destination = new File(System.getProperty("user.dir") +
                   "/resources/screenshots/ (" + java.time.LocalDate.now() + testResult.getName() + ").png");
           try{
               FileHandler.copy(source, destination);
           }catch (IOException e){
               throw new RuntimeException(e);
           }
       }
    }




    @AfterClass
    public void tearDown(){
        delay(5000);
        driver.quit();
    }
}
