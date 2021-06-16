package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
    public static WebDriver driver = null;

    public DriverSetup() {
        if (driver == null) {
            setUp();
            driver.manage().window().maximize();

        }
    }
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

}


