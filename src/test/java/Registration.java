import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

/**
 * Created by Eric on 5/5/2017.
 */
public class Registration{

    private ChromeDriver driver;
    Registration(ChromeDriver driver1){
        this.driver = driver1;
    }

    //From login page click the register link
    public void validateRegistration(){
        try{
            driver.findElementByXPath(XpathHelper.clickToRegisterLink).click();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.findElement(By.id(XpathHelper.inputFieldFirstName)).sendKeys("tester1");
            driver.findElement(By.id(XpathHelper.inputFieldLastName)).sendKeys("tLastName");
            driver.findElement(By.id(XpathHelper.inputFieldEmail)).sendKeys("blah@fakemail.com");
            driver.findElement(By.id(XpathHelper.inputFieldRegUsername)).sendKeys("testinreg");
            driver.findElement(By.id(XpathHelper.inputFieldRegPassword)).sendKeys("password");

            //Click submit
            driver.findElement(By.id(XpathHelper.registerBtn)).click();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            System.out.println("validateRegistration(): Success");

        }catch(Exception e){
            System.out.println("**registerLink()** Error: " + e);
            //Continue with test
            HomePage homePage = new HomePage(driver);
            homePage.validateTabs();
        }
    }
}
