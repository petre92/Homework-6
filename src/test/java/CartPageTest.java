import StepObject.CartPageSteps;
import StepObject.LaptopsPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTest extends ChromeRunner {

    CartPageSteps cartPageSteps = new CartPageSteps();
    LaptopsPageSteps laptopPageSteps = new LaptopsPageSteps();

    @Test
    public void ProductsQuantity_Cart() {
        cartPageSteps.CartBtn();
        Assert.assertTrue(cartPageSteps.emptyMessageText.is(Condition.visible), "error message is shown");
        cartPageSteps.GoBackToLaptops();
        laptopPageSteps.ChooseAndAddPoducts();
        cartPageSteps.CartBtn()
                .RemoveProducts();
        Assert.assertTrue(cartPageSteps.emptyMessageText.is(Condition.visible), "error message is shown");
    }

    @Test
    public void RestoreItemTest() {
        cartPageSteps.CartBtn()
                .GoBackToLaptops();
        laptopPageSteps.ChooseAndAddPoducts();
        cartPageSteps
                .CartBtn()
                        .RemoveOneProduct();
        Assert.assertTrue(cartPageSteps.restoreItemText.is(Condition.visible));

    }

}
