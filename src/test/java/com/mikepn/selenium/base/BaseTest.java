package com.mikepn.selenium.base;

import com.mikepn.selenium.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

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
    public void tearDown(){
        delay(5000);
        driver.quit();
    }
}
