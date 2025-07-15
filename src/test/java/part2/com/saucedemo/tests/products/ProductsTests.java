package part2.com.saucedemo.tests.products;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;
import part2.saucedemo.pages.ProductsPage;

public class ProductsTests extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductsPage productsPage = loginPage.logInToApplication("standard_user", "secret_sauce");
        //The message will appear if the test fails
        Assert.assertTrue(
                productsPage.isProductsHeaderDisplayed(),
                "The Products Header is not being displayed"
        );
    }
}
