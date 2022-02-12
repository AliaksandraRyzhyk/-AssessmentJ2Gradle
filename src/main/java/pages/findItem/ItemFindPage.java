package pages.findItem;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$x;

public class ItemFindPage {
    private final SelenideElement itemName = $x("//h1[@class='goods__title']");
    private final SelenideElement itemPrice = $x("//span[@class='goods__price']");


    @Step("Зафиксировать наименование товара")
    public void getItemName() {
        itemName.shouldBe(Condition.text("Напиток KICK DRINK, QNT"));
    }

    @Step("Зафиксировать стоимость товара")
    public void getItemPrice() {
        itemPrice.shouldBe(Condition.text("3.50 руб."));
    }

}
