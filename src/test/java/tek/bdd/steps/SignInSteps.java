package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.HomePage;
import tek.bdd.pages.SignInPage;
import tek.bdd.utility.SeleniumUtility;

public class SignInSteps extends SeleniumUtility {
    @When("user click on sign in link")
    public void userClickOnSignInLink() {
        clickOnElement(HomePage.SIGN_IN_LINK);
    }
    @Then("validate user is in  sign in page")
    public void validateUserIsInPage() {
        String pageTitle = getElementText(SignInPage.PAGE_SUBTITLE);
        Assert.assertEquals("Sign in", pageTitle);
    }
    @Then("user should be able to see {string} link")
    public void userShouldBeAbleToSeeLink(String expectedLinkText) {
        String actualLinkText = getElementText(SignInPage.CREATE_ACCOUNT_BUTTON);
        Assert.assertEquals(expectedLinkText, actualLinkText);
    }
}
