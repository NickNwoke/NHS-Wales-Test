package uk.nhsbsa.services.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlaucomaPage extends BasePage {

    @FindBy(id = "label-no")
    private final WebElement noGlaucoma = null;
    @FindBy(id = "next-button")
    private final WebElement nextButton = null;


    public GlaucomaPage(WebDriver driver) {
        super(driver);
    }

    public GlaucomaPage answerDoYouOrFamilyHaveGlaucoma() {
        noGlaucoma.click();
        return this;
    }

    public CareHomePage moveToCareHomePage() {
        nextButton.click();
        return PageFactory.initElements(driver, CareHomePage.class);
    }
}
