package uk.nhsbsa.services.walesStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import uk.nhsbsa.services.pages.DateOfBirthPage;
import uk.nhsbsa.services.pages.NhsCostStartPage;
import uk.nhsbsa.services.pages.QualifiedPage;
import uk.nhsbsa.services.pages.WhereYouLivePage;
import uk.nhsbsa.services.support.WorldHelper;

public class ScenarioSteps {

    private WorldHelper helper;
    private NhsCostStartPage nhsCostStartPage;
    private WhereYouLivePage whereYouLivePage;
    private DateOfBirthPage dateOfBirthPage;
    private QualifiedPage qualifiedPage;

    public ScenarioSteps(WorldHelper helper) {
        this.helper = helper;
    }

    @Given("I am a NHS checkerTool website")
    public void iAmANHSCheckerToolWebsite() {
       nhsCostStartPage = helper.getBasePage().
               prepareBrowser();
    }

    @Given("I am a resident from Wales")
    public void iAmAResidentFromWales() {
    dateOfBirthPage= nhsCostStartPage
            .selectStartButton()
                .moveToDateOfBirth();
    }

    @When("I put my details into the Checker tool")
    public void iPutMyDetailsIntoTheCheckerTool() {
    qualifiedPage = dateOfBirthPage.enterDayOfBirth()
            .enterMonthOfBirth()
            .enterYearOfBirth().
            moveToPartner().
            answerPartnerQuestion().
            moveToClaimBenefit().
            moveToPregnantOrGivenBirth().
            answerAreYouPregnant().moveToWarPensioner()
            .answerDoYouHaveInjuryOrIllness()
            .moveToDiabetesPage()
            .answerDoYouHaveDiabetes().answerDoYouHaveDiabetes().moveToGlaucomaPage()
            .answerDoYouOrFamilyHaveGlaucoma().moveToCareHomePage()
            .answerDoYouLiveInCareHome()
            .answerDoYouLiveInCareHome().moveToInvestmentPage()
            .answerDoYouHaveInvestments()
            .moveToQualifiedPage();

    }

    @Then("I should know if I am qualify to {string}")
    public void iShouldKnowIfIAmQualifyTo(String message) {
        Assert.assertTrue(qualifiedPage.validateQualifiedPage(message));
    }

    @Then("I should then get a result of whether I will {string}")
    public void iShouldThenGetAResultOfWhetherIWill(String getHelpOrNotMessage) {
        Assert.assertTrue(qualifiedPage.validateGetHelpOrNot(getHelpOrNotMessage));
    }
}