import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Eric on 4/20/2017.
 */
public class MakeSchiftAutomation{


    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:/Users/Eric/Desktop/680Automation/MakeschiftAutoamtion/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/");

        //From landing page, go to login page
        driver.findElementByXPath("/html/body/h1[2]/p/a[1]").click();

//        driver.findElementByXPath("/html/body/form/input[1]").sendKeys("user1");
//        driver.findElementByXPath("/html/body/form/input[2]").sendKeys("password");
//        driver.findElementByXPath("/html/body/form/button").click();

        //Validate Login elements
        LoginPage login = new LoginPage(driver);
        //login.registerLink();
        login.validateLogin();

    }
}
