package Browser_Manager;

import Browser_Manager.DriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {


    @Override
    public void createDriver() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Usuario\\Desktop\\Curso udemy\\Selenium_Cucumber\\Framework_Automatizado\\src\\test\\java\\Resources\\geckodriver.exe");
        driver = new FirefoxDriver();
    }
}
