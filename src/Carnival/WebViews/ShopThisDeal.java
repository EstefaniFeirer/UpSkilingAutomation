import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ShopThisDeal {

   @FindBy (css = "span[class= 'hp-font-tempo hp-text-blue-dark hp-my-4']")
    private WebElement ButtonShopThisDeal;

   @FindBy (css = "h1[class= 'easypay-search-banner__copy__title']" )
    private WebElement TitleSearch;


    public ShopThisDeal(WebDriver driver) {

        By Text = By.cssSelector("h1[class= 'easypay-search-banner__copy__title']");
        PageFactory.initElements(driver, this);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(ButtonShopThisDeal));
        ButtonShopThisDeal.click();
        wait.until(ExpectedConditions.visibilityOf(TitleSearch));

        Assert.assertEquals(driver.findElement(Text).getText(),"ZIP INTO SAVINGS SALE");
        System.out.println("this is the summary : " + driver.findElement(Text).getText());



}
public boolean Text (){

        return TitleSearch.isDisplayed();
}
}