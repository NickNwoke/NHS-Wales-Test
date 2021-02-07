package uk.nhsbsa.services.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PregnancyPage extends BasePage{


    @FindBy(id = "label-no")
    private final WebElement noPregnancy = null;
    @FindBy(id = "next-button")
    private final WebElement nextButton = null;

    public PregnancyPage(WebDriver driver) {
        super(driver);
    }

    public PregnancyPage answerAreYouPregnant() {
        noPregnancy.click();
        return this;
    }

    public InjuryOrIllnessPage moveToWarPensioner() {
        nextButton.click();
        return PageFactory.initElements(driver, InjuryOrIllnessPage.class);
    }
}
