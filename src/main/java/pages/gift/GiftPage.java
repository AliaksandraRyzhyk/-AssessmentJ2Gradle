package pages.gift;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$x;

public class GiftPage {
    private final SelenideElement helpButton = $x("//a[text()='Помощь']");
    private final SelenideElement submenuLink = $x("(//a[text()='Подарочный сертификат'])[1]");
    private final SelenideElement brandButton = $x("(//label[@class='checkbox__label'])[2]");
    private final SelenideElement resultMessage = $x("//div[text()='Найдено 3 товаров']");

    @Step("Навести курсор на 'Помощь'")
    public void clickHelpButton(){
        helpButton.click();
    }

    @Step("Нажать на кнопку 'Подарочные сертификаты'")
    public void clickSubmenuLink(){
        submenuLink.click();
    }

    @Step("Нажать на кнопку фильтра 'Fizcult'")
    public void clickBrandButton(){
        brandButton.click();
    }

    @Step("Определить количество найденных товаров после применения фильтра")
    public void resultMessageIsVisible(){
        resultMessage.shouldBe(Condition.visible);
    }

}
