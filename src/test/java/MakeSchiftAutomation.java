import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Eric on 4/20/2017.
 */
public class MakeSchiftAutomation{


    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:/Users/Eric/Desktop/680Automation/MakeschiftAutoamtion/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/");

        //From landing page, go to login page
        driver.findElementByXPath(XpathHelper.landingPageSignIn).click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //Validate Registration elements/page
        Registration registration = new Registration(driver);
        registration.validateRegistration();

        //Validate Login elements
        //LoginPage login = new LoginPage(driver);
        //login.validateLogin();

    }
}
