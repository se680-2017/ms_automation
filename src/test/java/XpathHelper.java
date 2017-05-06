import org.openqa.selenium.WebElement;

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
}
