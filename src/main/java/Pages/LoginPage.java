package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(id="user-name")
    WebElement userName;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id="login-button")
    WebElement btnLogin;

    @FindBy(xpath = "//div[@class='login_logo']")
    WebElement logo;

    public LoginPage(WebDriver driver){
        this.driver =  driver;
        PageFactory.initElements(driver,this);
    }

    public boolean verifyLogo(){
        return logo.isDisplayed();
    }

    public void login (String user, String pass){
        userName.sendKeys(user);
        password.sendKeys(pass);
        btnLogin.click();
    }

}
