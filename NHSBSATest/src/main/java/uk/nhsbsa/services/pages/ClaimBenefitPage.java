package uk.nhsbsa.services.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClaimBenefitPage extends BasePage {
    @FindBy(id = "next-button")
    private final WebElement nextButton = null;
    @FindBy(id = "label-no")
    private final WebElement noBenefit = null;

    public ClaimBenefitPage(WebDriver driver) {
        super(driver);
    }

    public ClaimBenefitPage answerDoYouClaimBenefit() {
        noBenefit.click();
        return this;
    }

    public PregnancyPage moveToPregnantOrGivenBirth() {
        nextButton.click();
        return PageFactory.initElements(driver, PregnancyPage.class);
    }
}