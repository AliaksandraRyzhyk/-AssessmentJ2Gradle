package steps.findItem;

import io.cucumber.java.ru.Затем;
import pages.findItem.ItemFindPage;

public class ItemFindPageDef {
    ItemFindPage itemFindPage = new ItemFindPage();

    @Затем("Наименование товара соответствует {string}")
    public void getItemName(String text) {
        itemFindPage.getItemName();
    }

    @Затем("Цена товара равна {string}")
    public void getItemPrice(String text) {
        itemFindPage.getItemPrice();
    }
}
