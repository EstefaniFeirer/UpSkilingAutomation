import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {

    private static WebDriver driver;
    private static WebDriverWait wait;

    public Login(WebDriver _driver) {
        driver = _driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="username")
    private static WebElement txtEmail;

    @FindBy(id="password")
    private static WebElement txtPwd;

    @FindBy(css="button[type='submit']")
    private static WebElement btnLogin;

    public static SearchCruise ValidCredentials(String username, String password){
        wait.until(ExpectedConditions.visibilityOf(txtEmail));

        txtEmail.sendKeys(username);
        txtPwd.sendKeys(password);
        btnLogin.click();

        return new SearchCruise(driver);

    }
    public static CruiseFilter ValidCredentials1(String username, String password){
        wait.until(ExpectedConditions.visibilityOf(txtEmail));

        // Escribir username que viene por parametros
        txtEmail.sendKeys(username);

        // Escribir password que viene por parametros
        txtPwd.sendKeys(password);

        // Click en login button
        btnLogin.click();

        return new CruiseFilter(driver);

    }
    public static ShopThisDeal ValidCredentials2(String username, String password){
        wait.until(ExpectedConditions.visibilityOf(txtEmail));

        // Escribir username que viene por parametros
        txtEmail.sendKeys(username);

        // Escribir password que viene por parametros
        txtPwd.sendKeys(password);

        // Click en login button
        btnLogin.click();

        return new ShopThisDeal(driver);

}
}