package StepObject;

import PageObject.CartPage;
import PageObject.LaptopsPage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.*;

public class CartPageSteps extends CartPage {


    public CartPageSteps CartBtn() {
        cartPage.click();
        return this;
    }

    public CartPageSteps RemoveProducts() {
        int remove = removeList.size();
        for (int i = 0; i < remove; i++) {
            removeList.get(i).click();
            sleep(1000);
        }
        return this;
    }

    public CartPageSteps GoBackToLaptops() {
        open("https://www.multitronic.fi/computers---tablets/notebooks");
        return this;
    }

    public CartPageSteps RemoveOneProduct() {
        int remove = removeList.size();
        for (int i = 0; i < remove; i++) ;
        removeList.get(1).click();
        sleep(5000);
        return this;
    }

}
