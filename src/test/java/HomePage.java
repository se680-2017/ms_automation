import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Eric on 5/6/2017.
 */
public class HomePage{

    private ChromeDriver driver;
    HomePage(ChromeDriver driver1){
        this.driver = driver1;
    }

    public void validateTabs(){
        String displayTextHome = driver.findElementByXPath(XpathHelper.displayStringHome).getText();
        WebElement inboxTab = driver.findElementByXPath(XpathHelper.inboxTab);
        WebElement fileSentTab = driver.findElementByXPath(XpathHelper.fileSentTab);
        WebElement profileTab = driver.findElementByXPath(XpathHelper.profileTab);

        try{
            if(displayTextHome.contains("Upload and Send a File")){
                inboxTab.click();
                Thread.sleep(1000);
                fileSentTab.click();
                Thread.sleep(1000);
                profileTab.click();
                Thread.sleep(1000);
                System.out.println("validateTabs: success");
            }else{
                throw new Exception("Could not make it to the Home page.");
            }

        }catch(Exception e){
            System.out.println("**HomePage*validateTabs()** Error: " + e);
        }
    }

//    public void sendFile(){
//
//        try{
//
//        }catch(Exception e){
//            System.out.println("**HomePage*sendFile()** Error: " + e);
//        }
//    }



}
