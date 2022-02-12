package steps.gift;

import io.cucumber.java.ru.Затем;
import pages.gift.GiftPage;

public class GiftPageDef {
    GiftPage giftPage = new GiftPage();

    @Затем("Нажать на кнопку на 'Помощь'")
    public void clickHelpButton(){
        giftPage.clickHelpButton();
    }
    @Затем("Нажать на кнопку 'Подарочные сертификаты'")
    public void clickSubmenuLink(){
        giftPage.clickSubmenuLink();
    }

    @Затем("Нажать на кнопку фильтра 'Fizcult'")
    public void clickBrandButton(){
        giftPage.clickBrandButton();
    }

    @Затем("Результат приминения фильтра {string} виден")
    public void resultMessageIsVisible(String text) {
        giftPage.resultMessageIsVisible();
    }
}
