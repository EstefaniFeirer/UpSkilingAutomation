import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchCruise {


    @FindBy(css = "li[class = 'cdc-filters-tab cdc-filters-tab--searchcta ng-scope']")
    private WebElement buttonSearchCruise;



    @FindBy(css = "span[class= 'sbsc-container__result-count ng-binding']")
    private WebElement searchResult;


    public SearchCruise(WebDriver driver) {
        By Textresult = By.cssSelector("span[class= 'sbsc-container__result-count ng-binding']");

        PageFactory.initElements(driver, this);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(buttonSearchCruise));
        buttonSearchCruise.click();
        wait.until(ExpectedConditions.visibilityOf(searchResult));
        searchResult.click();

        System.out.println("This is Buises page, there are: " +driver.findElement(Textresult).getText());



    }

    public boolean testReturn(){

        return searchResult.isDisplayed();

    }
}