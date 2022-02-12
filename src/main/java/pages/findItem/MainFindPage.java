package pages.findItem;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MainFindPage {
    private final SelenideElement searchStart = $x("//input[@class='search__input']");
    private final SelenideElement buttonSearch = $x("//button[@class='search__submit']");
    private final ElementsCollection elementProduct = $$x("//h3");


    @Step("Ввести в поисковую строку {0}")
    public void enterText(String text) {
        searchStart.setValue(text);
    }

    @Step("Нажать на кнопку поиска товара")
    public void clickButtonSearch() {
        buttonSearch.click();
    }

    @Step("Нажать на товар с наименованием {0}")
    public void selectItem(String text) {
        elementProduct.find(Condition.text(text)).scrollIntoView(false).click();
    }
}
