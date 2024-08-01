package tek.bdd.pages;
import org.openqa.selenium.By;
public class HomePage {
    public static final By TEKSCHOOL = By.className("top-nav__logo active");
    // Search
    public static final By SEARCH_INPUT = By.id("searchInput");
    public static final By SEARCH_BUTTON = By.id("searchBtn");
    // Main buttons
    public static final By SIGN_IN_LINK = By.id("signinLink");
        public static final By CART_BUTTON = By.id("cartBtn");
    public static final By TEST_SELENIUM = By.linkText("Test Selenium");
    // After sign in Main Page
    public static final By ACCOUNT_LINK = By.id("accountLink");
    public static final By ORDERS_LINK = By.id("orderLink");
    public static final By LOG_OUT = By.id("logoutBtn");
    // Electronics
    public static final By TV_AND_VIDEO = By.linkText("TV & Video");
    public static final By VIDEO_GAMES = By.linkText("Video Games");
    // Computers
    public static final By ACCESSORIES = By.linkText("Accessories");
    public static final By NETWORKING = By.linkText("Networking");
    // Smart Home
    public static final By SMART_HOME_LIGHTNING = By.linkText("Smart Home Lightning");
    public static final By PLUGS_AND_OUTLETS = By.linkText("Plugs and Outlets");
    // Sports
    public static final By ATHLETIC_CLOTHING = By.linkText("Athletic Clothing");
    public static final By EXERCISE_AND_FITNESS = By.linkText("Exercise & Fitness");
    // Automative
    public static final By AUTOMATIVE_PARTS_ACCESSORIES = By.linkText("Automative Parts & Accessories");
    public static final By MOTOCYCLE_AND_POWERSPORTS = By.linkText("MotorCycle & Powersports");
}
