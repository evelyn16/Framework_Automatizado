package Browser_Manager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {


    @Override
   public void createDriver() {
        System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Usuario\\Desktop\\Curso udemy\\Selenium_Cucumber\\Framework_Automatizado\\src\\test\\java\\Resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }
}
