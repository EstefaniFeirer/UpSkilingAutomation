import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CruiseFilterRun {

    public WebDriver driver;
    public Login login;
    public CruiseFilter cruiseFilter;



    @BeforeTest
    public void Filter() {

        System.setProperty("webdriver.chrome.driver", "C:\\TAE\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.carnival.com/profilemanagement/accounts/login");

        driver.manage().window().maximize();
        login =  new Login(driver);
        cruiseFilter = login.ValidCredentials1("estefanifeirer19@gmail.com", "Adivinala...");
}

    @Test
    public void Cruises(){
        Assert.assertTrue(cruiseFilter.ResultSailToButton(), "This options is no present");

    }



    @AfterTest

    public void afterTest() {
        driver.close();
    }
}
