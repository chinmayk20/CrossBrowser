package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

import static org.openqa.selenium.support.How.ID;
import static org.openqa.selenium.support.How.NAME;

/**
 * Created by CK on 11/03/2017.
 *
 */

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = NAME, using = "Username")
    public WebElement txtUserName;

    @FindBy(how = ID, using = "Login")
    public WebElement btnLogin;

    public void Login(){

        //txtUserName.sendKeys(userName);
    }

    public void ClickLogin(){
        btnLogin.click();
    }

}
