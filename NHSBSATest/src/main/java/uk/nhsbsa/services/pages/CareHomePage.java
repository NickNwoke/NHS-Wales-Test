package uk.nhsbsa.services.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareHomePage extends BasePage {

    @FindBy(id = "label-no")
    private final WebElement noCareHome = null;
    @FindBy(id = "next-button")
    private final WebElement nextButton = null;


    public CareHomePage(WebDriver driver) {
        super(driver);
    }

    public CareHomePage answerDoYouLiveInCareHome() {
        noCareHome.click();
        return this;
    }

    public InvestmentPage moveToInvestmentPage() {
        nextButton.click();
        return PageFactory.initElements(driver, InvestmentPage.class);
    }
}
