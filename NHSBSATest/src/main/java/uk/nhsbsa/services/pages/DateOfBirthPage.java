package uk.nhsbsa.services.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DateOfBirthPage extends BasePage {
    @FindBy(id = "dob-day")
    private final WebElement dayOfBirthInputField = null;
    @FindBy(id = "dob-month")
    private final WebElement monthOfBirthInputField = null;
    @FindBy(id = "dob-year")
    private final WebElement yearOfBirthInputField = null;
    @FindBy(id = "next-button")
    private final WebElement nextButton = null;

    public DateOfBirthPage(WebDriver driver) {
        super(driver);
    }

    public DateOfBirthPage enterDayOfBirth() {
        dayOfBirthInputField.sendKeys("12");
        return this;
    }

    public DateOfBirthPage enterMonthOfBirth() {
        monthOfBirthInputField.sendKeys("05");
        return this;
    }

    public DateOfBirthPage enterYearOfBirth() {
        yearOfBirthInputField.sendKeys("1981");
        return this;
    }

    public PartnerPage moveToPartner() {
        nextButton.click();
        return PageFactory.initElements(driver, PartnerPage.class);
    }
}
