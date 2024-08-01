package tek.bdd.steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;
public class SecurityTestSteps extends SeleniumUtility {

    @Then("click on SignIn button")
    public void clickOnSignInButton() {
        clickToElement(By.id("signinLink"));
    }
    @Then("input the validate username and password")
    public void enterValidateUserNamePassword() {
        sendText(By.id("email"), "elenavin5@gmail.com");
        sendText(By.id("password"), "Mona3yo#");
    }
    @And("click on the login button")
    public void clickOnLoginInButton() {
        clickToElement(By.id("loginBtn"));
    }
    @Then("user should be able to see account link")
    public void validateAccountText() {
        boolean accountButtonIsDisplayed = isElementDisplayed(By.id("accountLink"));
        Assert.assertTrue(accountButtonIsDisplayed);
    }
}