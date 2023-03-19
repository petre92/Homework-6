package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LaptopsPage {


    //აქ ვინახავთ ელემენტებს, გამოვყოფთ მძიმეებით

    public SelenideElement

    brandsFilter = $(by("data-id", "#manufacturer_group")),
    chooseLenovo = $(by("title", "LENOVO")),
    ramFilter = $(by("title", "RAM")),
    chooseRam = $(by("data-shop", "4.0")),
    storageFilter = $(by("title", "Storage")),
    chooseStorage = $(by("for", "facet32_033180")),
    searchField = $(byId("keyword_text")),
    searchBtn = $(byClassName("input-group-btn"), 0),
    amountOfProducts = $(byClassName("hitAmountNr")),
    productsInCart= $(byClassName("pCount")),
    addToCartText = $(byText("Add to cart"));


    public ElementsCollection
           addToCartQuantity = $$(byClassName("prodAddToCart"));
}
