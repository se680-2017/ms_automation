import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by Eric on 4/20/2017.
 */
public class LoginPage{

    private ChromeDriver driver;
    LoginPage(ChromeDriver driver1){
        this.driver = driver1;
    }


    //attempts to input invalid credentials until successfully logging in
    public void validateLogin(){
        try{
            String displayText = driver.findElementByXPath(XpathHelper.displayString).getText();
            WebElement signInBtn = driver.findElementByXPath(XpathHelper.loginSignInBtn);
            WebElement inputUsername = driver.findElementByXPath(XpathHelper.inputFieldUsername);
            WebElement inputPassword = driver.findElementByXPath(XpathHelper.inputFieldPassword);

            ArrayList arrayList = new ArrayList();
            arrayList.add("badUsername");
            arrayList.add("badPassword");
            arrayList.add("user1");
            arrayList.add("password");

            inputUsername.sendKeys("user1");
            inputPassword.sendKeys("password");
            signInBtn.click();

//            int i = 0;
//            while(displayText.contains("Please sign in")){
//                inputUsername.sendKeys(arrayList.get(i).toString());
//                inputPassword.sendKeys(arrayList.get(i+1).toString());
//                signInBtn.click();
//                i++;
//            }

        }catch(Exception e){
            System.out.println("**validateLogin()** Error: " + e);
        }

    }

}
