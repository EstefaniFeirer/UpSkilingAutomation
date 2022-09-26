import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataProvider {

    WebDriver driver;

    @BeforeTest

    public void Test1(){

        System.setProperty("webdriver.chrome.driver", "C:\\TAE\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.carnival.com/profilemanagement/accounts/login");
        driver.manage().window().maximize();
}

@Test (dataProvider = "AuthenticationData")
    public void Login(Integer n, String s){

}
@org.testng.annotations.DataProvider(name = "authenticationData")
    public Object [][] getData(){
        Object[][]data = new Object[1][1];
        data [0][0]="estefanifeirer19@gmail.com";data[0][1]="Adivinala...21";
        return data;
    }

    @AfterTest
    public void AfterClass(){
      //  driver.close();//
    }
}
