package homePageTest;

import homePage.SearchProduct;
import org.testng.annotations.Test;

public class SearchProductTest extends SearchProduct {
    @Test
    public void testOnSearchProducts() {
        validateSearch();
        validateSubmitSearch();
        validateSearchResult();
        validateProducts();
        validateShoppingCart();
    }
}
