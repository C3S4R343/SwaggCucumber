package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage {
    WebDriver driver;

    @FindBy(className = "inventory_item_name")
    List<WebElement> cartItems;

    @FindBy(id="checkout")
    WebElement checkoutButton;

    public CartPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public int getCartItemCount(){
        return cartItems.size();
    }

    public void checkout(){
        checkoutButton.click();
    }

}
