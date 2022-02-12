package steps.findItem;

import io.cucumber.java.ru.Затем;
import pages.findItem.MainFindPage;

public class MainFindPageDef {
    MainFindPage mainFindPage = new MainFindPage();

    @Затем("Ввести {string} в поисковую строку")
    public void enterItemName(String text) {
        mainFindPage.enterText(text);
    }

    @Затем("Нажать на кнопку поиска товара")
    public void clickButtonSearch() {
        mainFindPage.clickButtonSearch();
    }

    @Затем("Нажать на товар с наименованием {string}")
    public void selectItem(String text) {
        mainFindPage.selectItem(text);
    }

}
