package tek.bdd.steps;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.SignInPage;
import tek.bdd.utility.SeleniumUtility;
public class WrongUsernamePassword extends SeleniumUtility {
    @Then("validate user is in sign in page")
    public void validateSignInPage() {
        String pageSubTitle = getElementText(SignInPage.PAGE_SUBTITLE);
        Assert.assertEquals("Sign in", pageSubTitle);
    }
    @Then("enters \"invalid@gmail.com\" and \"Password@123\"")
    public void user_enter_username_and_password() {
        sendText(SignInPage.EMAIL_INPUT, "wrong@gmail.com");
        sendText(SignInPage.PASSWORD_INPUT, "Mona3yo#");
    }
    @Then("should see an error message {string}")
    public void errorMassage(){
        String actualErrorMessage = getElementText(SignInPage.ERROR_MESSAGE);
        String expectedErrorMessage = "wrong username or password";
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}
