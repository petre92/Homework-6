import StepObject.LaptopsPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.ElementsCollection;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.naming.directory.SearchResult;

import java.lang.management.GarbageCollectorMXBean;

import static DataObject.LaptopsPageData.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class LaptopsPageTest extends ChromeRunner {

    LaptopsPageSteps laptopPageSteps = new LaptopsPageSteps();
    @Test

    public void ProductsQuantityTest() {

       /*laptopPageSteps.CloseBrandFilter()
                .Compare()
   .CloseBrandFilter()
                        .Search_Input(searchBrand)
                                .SearchBtn()
                .Compare2();
        Assert.assertEquals(laptopPageSteps.Compare(), laptopPageSteps.Compare2(), "dd");*/

       laptopPageSteps.ChooseBrandFilter();
        sleep(3000);
        int amountByBrand = Integer.parseInt(laptopPageSteps.amountOfProducts.innerText());
        laptopPageSteps.CloseBrandFilter()
                .Search_Input(searchBrand)
                .SearchBtn();
        sleep(3000);
        int amountBySearch = Integer.parseInt(laptopPageSteps.amountOfProducts.innerText());
        Assert.assertEquals(amountByBrand, amountBySearch, "შედარება");
    }

    @Test
    public void AddToCartTest() {
        laptopPageSteps.ChooseBrandFilter()
                .ChooseRam()
                        .ChooseStorage()
                                .AddToCart();
        Assert.assertSame(laptopPageSteps.addToCartQuantity.size(), Integer.parseInt(laptopPageSteps.productsInCart.innerText()));
    }
}
