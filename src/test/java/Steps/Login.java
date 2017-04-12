package Steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.LoginPage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class Login extends BaseUtil{

    private BaseUtil base;

    public Login(BaseUtil base) {
        this.base = base;
    }


    @Then("^I click on login button")
    public void iSeeLoginPage()  {
        System.out.println("Click on Login button");
        //base.Driver.findElement(By.name("Login")).click();

       LoginPage page = new LoginPage(base.Driver);
       //page.ClickLogin();
        base.Driver.findElement(By.id("idcta-username")).click();

        String abc = base.Driver.getTitle();

        System.out.println("Title is " + abc);

    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage()  {
        System.out.println("Open the URL");
        //base.Driver.get("http://es.devserver.dev.dkids.mercury.dnitv.com:3000/");

        //base.Driver.get("http://es.devserver.dev.dkids.mercury.dnitv.com:3000/");
        base.Driver.get("https://www.discoverykidsplay.com/");
        //base.Driver.get("https://test.discoverykidsplay.uol.com.br/");
        String abc = base.Driver.getTitle();
        System.out.println("Title is " + abc);
    }

    @Then("^I click on submit button$")
    public void iClickOnSubmitButton()  {
        LoginPage page = new LoginPage(base.Driver);

        base.Driver.findElement(By.id("id-username")).click();

    }


    @And("^I check the status of the links$")
    public void iCheckTheStatusOfTheLinks() {

        //base.Driver.get("http://es.devserver.dev.dkids.mercury.dnitv.com:3000/");

        List<WebElement> linksList = clickableLinks(base.Driver);
        for (WebElement link : linksList) {
            String href = link.getAttribute("href");
            try {
                System.out.println("URL " + href + " returned " + linkStatus(new URL(href)));
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    // this is to support iCheckTheStatusOfTheLinks
    public static List<WebElement> clickableLinks(WebDriver driver) {
        List<WebElement> linksToClick = new ArrayList<WebElement>();
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        elements.addAll(driver.findElements(By.tagName("img")));

        for (WebElement e : elements) {
            if (e.getAttribute("href") != null) {
                linksToClick.add(e);
            }
        }
        return linksToClick;
    }

    // this is to support iCheckTheStatusOfTheLinks
    public static String linkStatus(URL url) {
        // http://download.java.net/jdk7/archive/b123/docs/api/java/net/HttpURLConnection.html#getResponseMessage%28%29
        try {
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            http.connect();
            String responseMessage = http.getResponseMessage();
            http.disconnect();
            return responseMessage;
        }
        catch (Exception e) {
            return e.getMessage();
        }
    }


    @And("^I get the list of all assets$")
    public void iGetTheListOfAllImages() throws Throwable {

        List<WebElement> list= base.Driver.findElements(By.xpath("//*[@href or @src]"));

        for(WebElement e : list){
            String link = e.getAttribute("href");
            if(null==link)
                link=e.getAttribute("src");
            System.out.println(e.getTagName() + "=" + link);
        }


    }
}