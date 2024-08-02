package tek.bdd.steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.pages.HomePage;
import tek.bdd.pages.SignInPage;
import tek.bdd.utility.SeleniumUtility;
public class SecurityTestSteps extends SeleniumUtility {

    @When("user click on sign in link")
    public void clickOnSignInLink() {
       clickOnElement(HomePage.SING_IN_LINK);
    }
    @Then("validate user is in sign in page")
    public void validateSignInPage() {
        String pageSubTitle = getElementText(SignInPage.PAGE_SUBTITLE);
        Assert.assertEquals("Sign in", pageSubTitle);
    }
    @When("user enter {string} and {string} and click on login")
    public void enterUsernameAndPassword(String username, String password) {
        sendText(SignInPage.EMAIL_INPUT, username);
        sendText(SignInPage.PASSWORD_INPUT, password);
        clickOnElement(SignInPage.LOGIN_BUTTON);
    }
    @Then("should see an error message {string}")
    public void errorMassage(String expectedErrorMessage) {
        String actualErrorMessage = getElementText(SignInPage.ERROR_MESSAGE);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Then("click on SignIn button")
    public void clickOnSignInButton() {
        clickOnElement(By.id("signinLink"));
    }
    @Then("input the valid username and password")
    public void enterValidateUserNamePassword() {
        sendText(By.id("email"), "elenavin5@gmail.com");
        sendText(By.id("password"), "Mona3yo#");
    }
    @And("click on the login button")
    public void clickOnLoginInButton() {
        clickOnElement(By.id("loginBtn"));
    }
    @Then("user should be able to see account link")
    public void validateAccountText() {
        boolean accountButtonIsDisplayed = isElementDisplayed(By.id("accountLink"));
        Assert.assertTrue(accountButtonIsDisplayed);
    }
}