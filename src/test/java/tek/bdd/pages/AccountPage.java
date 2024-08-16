package tek.bdd.pages;
import org.openqa.selenium.By;
public class AccountPage {
    // in your profile page
    public static final By PROFILE_PAGE_TITLE = By.className("account__personal-title");
    public static final By PROFILE_EMAIL_TEXT = By.className("account__information-email");
    public static final By TOAST_BOX = By.className("Toastify__toast-body");
    public static final By PROFILE_NAME_TEXT = By.className("account__information-username");

    // password information
    public static final By PREVIOUS_PASSWORD_INPUT = By.id("previousPasswordInput");
    public static final By NEW_PASSWORD_INPUT = By.id("newPasswordInput");
    public static final By CONFIRM_PASSWORD_INPUT = By.id("confirmPasswordInput");
    public static final By CHANGE_PASSWORD_BTN = By.id("credentialsSubmitBtn");




    public static final By PROFILE_EMAIl = By.cssSelector("h1.account__information-email");
    // personal information
    public static final By NAME = By.id("nameInput");
    public static final By PHONE_NUMBER_INPUT = By.id("personalPhoneInput");
    public static final By EMAIL_INPUT = By.id("emailInput");
    public static final By UPDATE_PERSONAL_INFO_BTN = By.id("personalUpdateBtn");

    // add debit or credit cart
    public static final By CARD_NUMBER_INPUT = By.id("cardNumberInput");
    public static final By NAME_ON_CARD_INPUT = By.id("nameOnCardInput");
    public static final By EXPIRATION_DATE_MONTH = By.id("expirationMonthInput");
    public static final By EXPIRATION_DATE_YEAR = By.id("expirationYearInput");
    public static final By SECURITY_CODE_INPUT = By.id("securityCodeInput");
    public static final By ADD_YOUR_CARD_BUTTON = By.id("paymentSubmitBtn");
    // wallet
    public static final By ADD_PAYMENT_METHOD_LINK = By.linkText("Add a payment method");
    // your address
    public static final By ADD_YOUR_ADDRESS_LINK = By.className("account__address-new-icon");
    public static final By COUNTRY = By.id("countryDropdown");
    public static final By FULL_NAME_INPUT_ADDRESS = By.id("fullNameInput");
    public static final By PHONE_NUMBER_INPUT_ADDRESS = By.id("phoneNumberInput");
    public static final By STREET_INPUT_ADDRESS = By.id("streetInput");
    public static final By APT_INPUT_ADDRESS = By.id("apartmentInput");
    public static final By CITY_INPUT_ADDRESS = By.id("cityInput");
    public static final By STATE_INPUT_ADDRESS = By.name("state");
    public static final By ZIP_CODE_INPUT_ADDRESS = By.id("zipCodeInput");
    public static final By ADD_ADDRESS_SUBMIT = By.id("addressBtn");
}
