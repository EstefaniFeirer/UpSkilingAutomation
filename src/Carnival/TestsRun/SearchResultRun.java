import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchResultRun {


    public WebDriver driver;
    public Login login;
    public SearchCruise searchCruise;




    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\TAE\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.carnival.com/profilemanagement/accounts/login");
        driver.manage().window().maximize();
        login =  new Login(driver);
       searchCruise = login.ValidCredentials("estefanifeirer19@gmail.com", "Adivinala...");


    }

    @Test
    public void SearchResult() {

        Assert.assertTrue(searchCruise.testReturn(), "This result si no present");
    }


@AfterTest

public void afterTest() {
    driver.close();
}


}
