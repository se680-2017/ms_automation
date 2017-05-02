import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Timer;

/**
 * Created by Eric on 4/20/2017.
 */
public class LoginPage{

    ChromeDriver driver = new ChromeDriver();
    //WebDriverWait wait = new WebDriverWait(driver, 10);
    //WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ID")));

    //From login page click the register link
    public void registerLink(){
        try{
            wait(3);
//            driver.findElementByXPath("/html/body/form/div[2]/label/a").click();
            driver.findElement(By.className("register")).click();
            wait(3);


            //We are now in the register page
            //if(driver.getCurrentUrl() == "http://localhost:8080/register"){
                //then success, go to back to login page
                driver.findElementByXPath("/html/body/div/div/div[2]/form/div[7]/a").click();
                wait(3);
            //}
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void validateLogin(){
        try{
            //Attempt bad credentials - ensure no access
            driver.findElementByXPath("/html/body/form/input[1]").sendKeys("badUser");
            driver.findElementByXPath("/html/body/form/input[2]").sendKeys("badcred");
            driver.findElementByXPath("/html/body/form/button").click();
            wait(3);
            //Attempt good credentials - ensure no access
            driver.findElementByXPath("/html/body/form/input[1]").click();
            driver.findElementByXPath("/html/body/form/input[1]").sendKeys("user1");
            driver.findElementByXPath("/html/body/form/input[2]").click();
            driver.findElementByXPath("/html/body/form/input[2]").sendKeys("password");
            driver.findElementByXPath("/html/body/form/button").click();
        }catch(Exception e){
            System.out.println(e);
        }

    }

}
