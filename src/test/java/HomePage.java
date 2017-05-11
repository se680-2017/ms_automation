import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


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
                System.out.println("validateTabs(): success");
            }else{
                throw new Exception("Could not make it to the Home page.");
            }

        }catch(Exception e){
            System.out.println("**HomePage*validateTabs()** Error: " + e);
        }
    }

    public void sendFile(){

        try{
            Thread.sleep(2000);
            WebElement userDropDown = driver.findElementById(XpathHelper.userDropDown);
            WebElement timerDropDown = driver.findElementByXPath(XpathHelper.timerDropDown);
            Select selectUser = new Select(userDropDown);
            Select selectTimer = new Select(timerDropDown);

            userDropDown.click();
            selectUser.selectByIndex(1);
            Thread.sleep(2000);

            timerDropDown.click();
            selectTimer.selectByIndex(2);
            Thread.sleep(3000);

            WebElement fileStackWidget = driver.findElementByXPath(XpathHelper.fileStackWidget);
            fileStackWidget.click();

//            WebDriverWait wait = new WebDriverWait(driver, 60);// 1 minute
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ng-app\"]/body/div/div[1]/ng-include[3]/div/nav/ul/li[10]/a")));
//            driver.findElementByXPath("//*[@id=\"ng-app\"]/body/div/div[1]/ng-include[3]/div/nav/ul/li[10]/a");

//            WebElement fsPane = driver.findElementByXPath("//*[@id=\"ng-app\"]/body/div/div[1]/ng-include[3]");
//            Select selectFSOption = new Select(fsPane);
//            selectFSOption.selectByIndex(9);

            Thread.sleep(2000);
            driver.findElementByXPath("//*[@id=\"filepicker_shade\"]/div[1]/a").click();
            Thread.sleep(2000);
            driver.findElementByXPath(XpathHelper.logOutBtn).click();

        }catch(Exception e){
            System.out.println("**HomePage*sendFile()** Error: " + e);
        }
    }

}
