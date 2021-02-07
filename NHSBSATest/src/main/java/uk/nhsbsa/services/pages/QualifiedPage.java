package uk.nhsbsa.services.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QualifiedPage extends BasePage {
    @FindBy(id = "result-heading")
    private final WebElement NHSCostPage = null;
    @FindBy(id = "prescription-tick")
    private final WebElement getPrescription = null;

    public QualifiedPage(WebDriver driver) {
        super(driver);
    }

    public boolean validateQualifiedPage(String message) {
        return NHSCostPage.getText().contains(message);
    }

    public boolean validateGetHelpOrNot(String getHelpOrNotMessage) {
        return getPrescription.getText().contains(getHelpOrNotMessage);
    }
}