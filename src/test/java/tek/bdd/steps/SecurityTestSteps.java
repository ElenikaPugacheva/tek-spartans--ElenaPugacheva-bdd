package tek.bdd.steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;
public class SecurityTestSteps extends SeleniumUtility {
    @Given("Open browser navigate to retail app")
    public void openBrowser(){
        setupBrowser();
    }
    @Then("click on SignIn button")
    public void clickOnSignInButton(){
        clickToElement(By.id("signinLink"));
    }
    @When("input the validate username and password")
    public void enterValidateUserNamePassword(){
        sendText(By.id("email"),"elenavin5@gmail.com");
        sendText(By.id("password"),"Mona3yo#");
    }
    @And("click on the login SignIn button")
    public void clickOnLoginInButton(){
        clickToElement(By.id("loginBtn"));
    }
    @Then("validate the Account link from main page")
    public void validateAccountText(){
        String accountText = getElementText(By.id("accountLink"));
        System.out.println(accountText);
        Assert.assertEquals("Expected Account Text", accountText);
    }
    @Then("Close  browser")
    public void close(){
        quitBrowser();
    }
}
