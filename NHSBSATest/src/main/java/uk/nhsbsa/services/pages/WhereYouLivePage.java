package uk.nhsbsa.services.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhereYouLivePage extends BasePage {

    @FindBy(id = "label-wales")
    private final WebElement walesRadioButton = null;
    @FindBy(id = "next-button")
    private final WebElement nextButton = null;

    public WhereYouLivePage(WebDriver driver) {
        super(driver);
    }

    public WhereYouLivePage chooseCountry() {
        walesRadioButton.click();
        return PageFactory.initElements(driver, WhereYouLivePage.class);
    }

    public DateOfBirthPage moveToDateOfBirth() {
        nextButton.click();
        return PageFactory.initElements(driver, DateOfBirthPage.class);
    }
}
