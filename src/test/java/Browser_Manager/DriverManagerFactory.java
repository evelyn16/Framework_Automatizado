package Browser_Manager;

import Browser_Manager.ChromeDriverManager;
import Browser_Manager.DriverManager;

public class DriverManagerFactory {


public  static DriverManager getManager (DriverType type){

    DriverManager driverManager = null;
    switch (type){

        case CHROME:
            driverManager = new ChromeDriverManager();
            break;
        case FIREFOX:
            driverManager = new FirefoxDriverManager();
            break;

        default:
            System.out.println("El browser es invalido");
    }

    return  driverManager;
}

}
