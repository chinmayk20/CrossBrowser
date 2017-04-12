package Steps;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.internal.Utils.log;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitBrowserTest(){
        System.out.println("Open browser");
        System.setProperty("webdriver.chrome.driver","/Users/ckulkarn/Documents/Asset/chromedriver");
        base.Driver = new ChromeDriver();

        //System.setProperty("webdriver.gecko.driver","/Users/ckulkarn/Documents/Asset/geckodriver");
        //base.Driver = new FirefoxDriver();
    }

    @After
    public void Tear_Down(){
        base.Driver.quit();
        System.out.println("Close browser");
    }
}
