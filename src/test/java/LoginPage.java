import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;

/**
 * Created by Eric on 4/20/2017.
 */
public class LoginPage{

    private ChromeDriver driver;
    LoginPage(ChromeDriver driver1){
        this.driver = driver1;
    }

    //attempts to input invalid credentials/invalid str until successfully logging in
    public void validateLogin(){
        try{
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("badUsername");
            arrayList.add("badPassword");
            arrayList.add("\" or \"\"=\"");
            arrayList.add("user1");
            arrayList.add("password");

            for(int i = 0; i < arrayList.size()-1; i++){
                WebElement inputUsername = driver.findElementByXPath(XpathHelper.inputFieldUsername);
                WebElement inputPassword = driver.findElementByXPath(XpathHelper.inputFieldPassword);
                WebElement signInBtn = driver.findElementByXPath(XpathHelper.loginSignInBtn);

                inputUsername.sendKeys(arrayList.get(i));
                inputPassword.sendKeys(arrayList.get(i+1));
                signInBtn.click();
                Thread.sleep(1000);
            }
            String displayTextHome = driver.findElementByXPath(XpathHelper.displayStringHome).getText();
            if(displayTextHome.contains("Upload and Send a File")){
                Thread.sleep(2000);
                WebElement logOutBtn = driver.findElementByXPath(XpathHelper.logOutBtn);
                logOutBtn.click();

                System.out.println("validateLogin(): Success");
            }else{
                throw new Exception("Could not make it to the Home page.");
            }

        }catch(Exception e){
            System.out.println("**validateLogin()** Error: " + e);
            if(e.getMessage().contains("Could not make it to the Home page.")){
                driver.get("http://localhost:8080/");
                driver.findElementByXPath(XpathHelper.landingPageSignIn).click();
            }
        }

    }
}
