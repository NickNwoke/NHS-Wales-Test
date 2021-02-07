package uk.nhsbsa.services.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartnerPage extends BasePage{
    @FindBy(id = "label-no")
    private final WebElement noPartnerRadioButton = null;
    @FindBy(id = "next-button")
    private final WebElement nextButton = null;

    public PartnerPage(WebDriver driver) {
        super(driver);
    }

    public PartnerPage answerPartnerQuestion() {
        noPartnerRadioButton.click();
        return this;
    }

    public ClaimBenefitPage moveToClaimBenefit() {
        nextButton.click();
        return PageFactory.initElements(driver, ClaimBenefitPage.class);
    }
}



