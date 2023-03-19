package StepObject;

import PageObject.LaptopsPage;
import com.codeborne.selenide.Condition;
import org.testng.Assert;

import java.time.Duration;

import static DataObject.LaptopsPageData.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class LaptopsPageSteps extends LaptopsPage {
    //აქ ინახება ექშენები, ქლიქები, მეთოდები, ციკლები და ა.შ.


    public LaptopsPageSteps ChooseBrandFilter() {
        brandsFilter.click();
        chooseLenovo.click();
        brandsFilter.click();
        sleep(2000);
        return this;
    }

    public LaptopsPageSteps CloseBrandFilter() {
        ChooseBrandFilter();
        sleep(3000);
        return this;
    }

    public LaptopsPageSteps ChooseRam() {
        ramFilter.click();
        chooseRam.click();
        ramFilter.click();
        return this;
    }

    public LaptopsPageSteps ChooseStorage() {
        storageFilter.click();
        chooseStorage.click();
        storageFilter.click();
        return this;
    }

    public LaptopsPageSteps Search_Input(String searchLenovo) {
        searchField.setValue(searchLenovo);
        sleep(2000);
        return this;
    }

    public LaptopsPageSteps SearchBtn() {
        searchBtn.click();
        sleep(5000);
        return this;
    }

    public LaptopsPageSteps AmountOfProducts_Compare() {
        ChooseBrandFilter();
        String a = amountOfProducts.innerText();
        CloseBrandFilter();
        Search_Input(searchBrand);
        SearchBtn();
        String b = amountOfProducts.innerText();
        Assert.assertEquals(a, b, "შედარება");
        return this;
    }

    public LaptopsPageSteps AddToCart() {
        int itemsQuantity = addToCartQuantity.size();
        for (int i = 0; i < itemsQuantity; i++) {
            addToCartQuantity.get(i).click();
            addToCartText.shouldBe(Condition.visible, Duration.ofMillis(2000));
            sleep(2000);
        }
        return this;
    }

    public LaptopsPageSteps ChooseAndAddPoducts() {
        ChooseBrandFilter();
        ChooseRam();
        ChooseStorage();
        AddToCart();
        return this;
    }

    public LaptopsPageSteps Compare() {

        // ChooseBrandFilter();
        sleep(3000);
        Integer.parseInt(amountOfProducts.innerText());
        System.out.println(Integer.parseInt(amountOfProducts.innerText()));
        return this;
    }

    public LaptopsPageSteps Compare2() {
        //Search_Input(searchBrand);
        //SearchBtn();
        sleep(3000);
        Integer.parseInt(amountOfProducts.innerText());
        System.out.println(Integer.parseInt(amountOfProducts.innerText()));
        return this;
    }

}

