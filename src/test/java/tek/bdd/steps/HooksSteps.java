package tek.bdd.steps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import tek.bdd.utility.SeleniumUtility;
public class HooksSteps extends SeleniumUtility {

    private static String currentPassword; // No default value

    @Before
    public void befoeEachScenaio(){
        setupBrowser();
    }
    @After
    public void afterEachScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = takeScreenShot();
            scenario.attach(screenshot, "image/png", "failed_scenario");
        }
        quitBrowser();
    }
   /* public static String getCurrentPassword() {
        return currentPassword;
    }

    public static void setCurrentPassword(String newPassword) {
        currentPassword = newPassword;
    }*/
}