import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Eric on 5/5/2017.
 */
public class XpathHelper{

    //Landing Page
    public static final String landingPageSignIn = "/html/body/h1[2]/p/a[1]";

    //Login Page
    public static final String displayString = "/html/body/form/h2"; // 'Please sign in' string in the login box
    public static final String inputFieldUsername = "/html/body/form/input[1]";
    public static final String inputFieldPassword = "/html/body/form/input[2]";
    public static final String loginSignInBtn = "/html/body/form/button";
    public static final String clickToRegisterLink = "/html/body/form/div[2]/label/a";

    //Registration Page
    public static final String inputFieldFirstName = "fname"; //id
    public static final String inputFieldLastName = "lname"; //id
    public static final String inputFieldEmail = "email"; //id
    public static final String inputFieldRegUsername = "username"; //id
    public static final String inputFieldRegPassword = "password"; //id
    public static final String registerBtn = "submitBtn"; //id

    //Home page
    public static final String logOutBtn = "//*[@id=\"logout\"]";
    public static final String displayStringHome = "//*[@id=\"tab1\"]/h1";
    public static final String inboxTab = "//*[@id=\"favorites\"]";
    public static final String fileSentTab = "//*[@id=\"following\"]";
    public static final String profileTab = "//*[@id=\"stars\"]";
    public static final String userDropDown = "userDropDown"; //id
    public static final String timerDropDown = "//*[@id=\"timeDropDown\"]";
    public static final String fileStackWidget = "//*[@id=\"uploadControls\"]/button";

    //FileStack Window Elements
    public static final String webImages = "//*[@id=\"ng-app\"]/body/div/div[1]/ng-include[3]/div/nav/ul/li[16]/a";
    public static final String linkURLOption = "//*[@id=\"ng-app\"]/body/div/div[1]/ng-include[3]/div/nav/ul/li[10]/a";


}
