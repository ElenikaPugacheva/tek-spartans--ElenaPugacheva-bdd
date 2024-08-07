package tek.bdd.steps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.HomePage;
import tek.bdd.pages.SignInPage;
import tek.bdd.utility.SeleniumUtility;
public class SecurityTestSteps extends SeleniumUtility {

    @When("click on sign in link")
    public void clickOnSignInLink() {
        clickOnElement(HomePage.SIGN_IN_LINK);
    }

    @Then("validate is in sign in page")
    public void validateIsInSignInPage() {
        String pageSubTitle = getElementText(SignInPage.PAGE_SUBTITLE);
        Assert.assertEquals("Sign in", pageSubTitle);
    }

    @When("enter username and password and click on login")
    public void enterUsernameAndPasswordAndClickOnLogin() {
        sendText(SignInPage.EMAIL_INPUT, "elenavin5@gmail.com");
        sendText(SignInPage.PASSWORD_INPUT, "Mona3yo#");
        clickOnElement(SignInPage.LOGIN_BUTTON);
    }

    @When("user enter {string} and {string} and click on login")
    public void userEnterUsernameAndPassword(String username, String password) {
        sendText(SignInPage.EMAIL_INPUT, username);
        sendText(SignInPage.PASSWORD_INPUT, password);
        clickOnElement(SignInPage.LOGIN_BUTTON);
    }

    @Then("should be able to see account link")
    public void shouldBeAbleToSeeAccountLink() {
        boolean isAccountDisplayed = isElementDisplayed(HomePage.ACCOUNT_LINK);
        Assert.assertTrue(isAccountDisplayed);
    }

    @Then("user should see error message {string}")
    public void shouldSeeErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = getElementText(SignInPage.ERROR_MESSAGE);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}