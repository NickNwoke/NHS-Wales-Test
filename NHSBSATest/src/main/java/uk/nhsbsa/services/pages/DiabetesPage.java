package uk.nhsbsa.services.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiabetesPage extends BasePage {

    @FindBy(id = "label-no")
    private final WebElement noDiabetes = null;
    @FindBy(id = "next-button")
    private final WebElement nextButton = null;


    public DiabetesPage(WebDriver driver) {
        super(driver);
    }

    public DiabetesPage answerDoYouHaveDiabetes() {
        noDiabetes.click();
        return this;
    }

    public GlaucomaPage moveToGlaucomaPage() {
        nextButton.click();
        return PageFactory.initElements(driver, GlaucomaPage.class);
    }
}
