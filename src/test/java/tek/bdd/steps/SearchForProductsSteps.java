package tek.bdd.steps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tek.bdd.pages.CartPage;
import tek.bdd.pages.HomePage;
import tek.bdd.utility.SeleniumUtility;
import java.util.List;
public class SearchForProductsSteps extends SeleniumUtility {
    @When("user enter {string} in search bar and click on the search button")
    public void searchForProduct(String productName) {
        sendText(HomePage.SEARCH_INPUT, productName);
        clickOnElement(HomePage.SEARCH_BUTTON);
    }
    @Then("validate displayed products contains {string} in their title")
    public void validateDisplayedProducts(String expectedText) {
        List<WebElement> products = getElements(HomePage.ALL_PRODUCTS_NAME);
        for (WebElement element : products) {
            Assert.assertTrue(element.getText().toLowerCase().contains(expectedText.toLowerCase()));
        }
    }
    @When("user click on a product")
    public void chooseFirstProductInResult() {
        List<WebElement> products = getElements(HomePage.PRODUCT_NAME);
        System.out.println("Number of products found: " + products.size());
        if (products != null && !products.isEmpty()) {
            clickOnElement(products.get(0));
        } else {
            Assert.fail("No products found or products list is null.");
        }
    }
    @Then("user click on Add to Cart button")
    public void addToCartButton() {
        clickOnElement(HomePage.ADD_TO_CART_BUTTON);
    }
    @When("user click on Cart link")
    public void clickOnCart() {
        clickOnElement(HomePage.CART_LINK);
    }
    @Then("user validate that there is only one item in the cart")
    public void validateNumberOfItemInCart() {
        List<WebElement> numItemsInCart = getElements(CartPage.CART_ITEMS);
        Assert.assertEquals(1, numItemsInCart.size());
    }
    @Then("user delete the item from the cart")
    public void deleteItem() {
        clickOnElement(CartPage.DELETE_ITEM_FROM_CART);
    }
    @Then("validate item is deleted from the cart")
    public void validateTheCartIsEmpty() {
        String emptyCartMSG = getElementText(CartPage.CART_IS_EMPTY_MSG);
        Assert.assertEquals("The Shopping Cart is Empty", emptyCartMSG);
    }
}
