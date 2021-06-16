package Base;

import org.testng.annotations.BeforeTest;

public class UrlSetup extends DriverSetup {
    public String url = "null";
    @BeforeTest
    public void setUrl(){
        driver.get(url);
    }
}
