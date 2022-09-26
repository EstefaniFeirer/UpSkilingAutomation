import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CruiseFilter {


    @FindBy (css = "a#cdc-destinations")
    private WebElement SailTo;

    @FindBy (css = "div[class = 'cdc-filter-body ng-scope ng-isolate-scope']")
    private WebElement OptionSailTo;


    public CruiseFilter(WebDriver driver) {

        By SailToresult = By.cssSelector("div[class = 'cdc-filter-body ng-scope ng-isolate-scope']");
        PageFactory.initElements(driver, this);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        wait.until(ExpectedConditions.visibilityOf(SailTo));
        SailTo.click();
        wait.until(ExpectedConditions.visibilityOf(OptionSailTo));
        System.out.println("The Sail To button is unfoled: " + driver.findElement(SailToresult).isDisplayed());

    }

    public boolean ResultSailToButton (){

        return OptionSailTo.isDisplayed();
    }
}
