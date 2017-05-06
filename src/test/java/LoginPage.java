import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

/**
 * Created by Eric on 4/20/2017.
 */
public class LoginPage{

    private ChromeDriver driver;
    public LoginPage(ChromeDriver driver1){
        this.driver = driver1;
    }
    //WebDriverWait wait = new WebDriverWait(driver, 10);

    //From login page click the register link
    public void registerLink(){
        try{


            driver.findElement(By.className("register")).click();

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

    //attempts to input invalid credentials until successfully logging in
    public void validateLogin(){
        try{
            String displayText = driver.findElementByXPath("/html/body/form/h2").getText();
            ArrayList arrayList = new ArrayList();
            arrayList.add("badUsername");
            arrayList.add("badPassword");
            arrayList.add("user1");
            arrayList.add("password");

            int i = 0;
            while(displayText.contains("Please sign in")){
                driver.findElementByXPath("/html/body/form/input[1]").sendKeys(arrayList.get(i).toString());
                driver.findElementByXPath("/html/body/form/input[2]").sendKeys(arrayList.get(i+1).toString());
                driver.findElementByXPath("/html/body/form/button").click();
                i++;
            }

        }catch(Exception e){
            System.out.println(e);
        }

    }

}
