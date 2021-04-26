package Selenium_Code;

import Browser_Manager.DriverManager;
import Browser_Manager.DriverManagerFactory;
import Browser_Manager.DriverType;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;


public class Hooks {

    private  static WebDriver driver;
    private static DriverManager driverManager;

@Before
    public  void Setup(){

    driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
    driver = driverManager.getDriver();
    driver.get("http://opencart.abstracta.us/");
    driver.manage().window().maximize();
     }
     @After
     public  void quitDriver(){

    driverManager.quitDriver();

     }

     public  static  WebDriver getDriver(){

    return driver;
     }

}
