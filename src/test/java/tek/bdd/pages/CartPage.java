package tek.bdd.pages;

import org.openqa.selenium.By;

public class CartPage {
    public static final By PROCEED_CHECKOUT_BUTTON = By.id("proceedBtn");
    public static final By SELECT_ALL = By.linkText("Select All");
    public static final By DESELECT_ALL = By.linkText("Deselect All");
    public static final By QTY_NUMBER = By.className("cart__item-quantity");
    public static final By DELETE_ITEM_FROM_CART = By.className("Delete");
}
