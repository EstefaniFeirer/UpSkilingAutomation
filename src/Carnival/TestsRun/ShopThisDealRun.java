import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ShopThisDealRun {


    public WebDriver driver;
    public Login login;

    public ShopThisDeal shopThisDeal;

        @BeforeTest
        public void Filter() {

            System.setProperty("webdriver.chrome.driver", "C:\\TAE\\chromedriver.exe");
            this.driver = new ChromeDriver();
            this.driver.get("https://www.carnival.com/profilemanagement/accounts/login");

            this.driver.manage().window().maximize();
            login =  new Login(this.driver);
            shopThisDeal = login.ValidCredentials2("estefanifeirer19@gmail.com", "Adivinala...");
        }

        @Test
        public void Text2(){
            Assert.assertTrue(shopThisDeal.Text(), "This summary is no present");

        }



        @AfterTest

        public void afterTest() {
            this.driver.close();
        }
    }
