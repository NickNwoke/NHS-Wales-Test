package uk.nhsbsa.services.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvestmentPage extends BasePage {

    @FindBy(id = "label-no")
    private final WebElement noInvestment = null;
    @FindBy(id = "next-button")
    private final WebElement nextButton = null;


    public InvestmentPage(WebDriver driver) {
        super(driver);
    }

    public InvestmentPage answerDoYouHaveInvestments() {
        noInvestment.click();
        return this;
    }

    public QualifiedPage moveToQualifiedPage() {
        nextButton.click();
        return PageFactory.initElements(driver, QualifiedPage.class);
    }
}
