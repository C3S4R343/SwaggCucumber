package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    WebDriver driver;

    @FindBy(id="react-burger-menu-btn")
    WebElement menu;

    @FindBy(xpath = "//a[@data-test='logout-sidebar-link']")
    WebElement loggout;

    @FindBy(className = "inventory_item_name")
    WebElement productName;

    public ProductPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void openMenu(){
        menu.click();
    }

    public boolean isLogoutVisible(){
        return loggout.isDisplayed();
    }

    public void logOut(){
        loggout.click();
    }

}
