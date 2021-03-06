import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class FirefoxDemo {

    private WebDriver driver;

    @BeforeClass
    public void initDriver() {
        System.out.println("You are testing in Firefox");
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        driver = new FirefoxDriver();
        System.out.println("Firefox is in use");
    }

    @Test
    public void searchTestNGInGoogle() {
        final String searchKey = "TestNG";
        System.out.println("Search " + searchKey + " in google");
        driver.navigate().to("https://www.google.com");
//         WebElement element = driver.findElement(By.name("q"));
//         System.out.println("Enter " + searchKey);
//         element.sendKeys(searchKey);
        System.out.println("submit");
//         element.submit();
//         System.out.println("Got " + searchKey + " results");
    }

    @AfterClass
    public void quitDriver(){
        driver.quit();
    }
}

