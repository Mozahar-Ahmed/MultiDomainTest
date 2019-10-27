package homePageTest;

import homePage.SearchProduct;
import org.testng.annotations.Test;

public class SearchProductTest extends SearchProduct {
    @Test
    public void testOnbrowsingProducts() {
        validateSearch();
        validateSubmitSearch();
        validateSearchResult();
        validateProducts();
        validateShoppingCart();
    }
}
