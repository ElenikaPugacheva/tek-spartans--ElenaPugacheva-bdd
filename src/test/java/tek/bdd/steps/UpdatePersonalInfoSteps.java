package tek.bdd.steps;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.AccountPage;
import tek.bdd.utility.SeleniumUtility;
public class UpdatePersonalInfoSteps extends SeleniumUtility {
    @Then("validate account name is {string}")
    public void validateAccountProfileName(String expectedProfileName) {
        String actualProfileName = getElementText(AccountPage.PROFILE_NAME_TEXT);
        Assert.assertEquals("Account Profile should Match",
                expectedProfileName.trim(),
                actualProfileName.trim());
    }
}