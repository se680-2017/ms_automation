import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Element;

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

        //WebElement inputFieldFirstName = driver.findElementByXPath("//*[@id=\"fname\"]");
//        WebElement inputFieldLastName = driver.findElementByXPath(XpathHelper.inputFieldLastName);
//        WebElement inputFieldEmail = driver.findElementByXPath(XpathHelper.inputFieldEmail);
//        WebElement inputFieldRegUsername = driver.findElementByXPath(XpathHelper.inputFieldRegUsername);
//        WebElement inputFieldRegPassword = driver.findElementByXPath(XpathHelper.inputFieldRegPassword);
//        WebElement registerSubmitBtn = driver.findElementByXPath(XpathHelper.registerBtn);

        try{
            driver.findElementByXPath(XpathHelper.clickToRegisterLink).click();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

            //inputFieldFirstName.sendKeys("tester1");
            driver.findElement(By.id(XpathHelper.inputFieldFirstName)).sendKeys("tester1");
            //inputFieldLastName.sendKeys("tLastName");
            driver.findElement(By.id(XpathHelper.inputFieldLastName)).sendKeys("tLastName");
            //inputFieldEmail.sendKeys("blah@fakemail.com");
            driver.findElement(By.id(XpathHelper.inputFieldEmail)).sendKeys("blah@fakemail.com");
            //inputFieldRegUsername.sendKeys("testinregistration");
            driver.findElement(By.id(XpathHelper.inputFieldRegUsername)).sendKeys("testinreg");
            //inputFieldRegPassword.sendKeys("password");
            driver.findElement(By.id(XpathHelper.inputFieldRegPassword)).sendKeys("password");

            driver.findElement(By.id(XpathHelper.registerBtn)).click();

            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

            //driver.findElement(By.className("login-register")).click(); //login link at the bottom
        }catch(Exception e){
            System.out.println("**registerLink()** Error: " + e);
        }
    }
}
