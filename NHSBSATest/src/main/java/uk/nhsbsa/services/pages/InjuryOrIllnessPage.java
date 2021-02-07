package uk.nhsbsa.services.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InjuryOrIllnessPage extends BasePage {

    @FindBy(id = "label-no")
    private final WebElement noInjury = null;
    @FindBy(id = "next-button")
    private final WebElement nextButton = null;

    public InjuryOrIllnessPage(WebDriver driver) {
        super(driver);
    }

    public InjuryOrIllnessPage answerDoYouHaveInjuryOrIllness() {
        noInjury.click();
        return this;
    }

    public DiabetesPage moveToDiabetesPage() {
        nextButton.click();
        return PageFactory.initElements(driver, DiabetesPage.class);
    }
}
