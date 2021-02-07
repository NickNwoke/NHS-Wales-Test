package uk.nhsbsa.services.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NhsCostStartPage extends BasePage{

    public NhsCostStartPage(WebDriver driver){

        super(driver);
    }
    @FindBy(how = How.ID, using = "next-button")
    public WebElement startButton;


    public WhereYouLivePage selectStartButton() {
        startButton.click();
        return PageFactory.initElements(driver, WhereYouLivePage.class);
    }


}
