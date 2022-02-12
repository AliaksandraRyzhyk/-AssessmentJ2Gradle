package steps.sales;

import config.UserConfig;
import io.cucumber.java.ru.Затем;
import pages.sales.SalePage;

public class SalePageDef {
    SalePage salePage = new SalePage();

    @Затем("Нажать на кнопку 'Оптовикам'")
    public void clickButtonSale() {
        salePage.clickButton();
    }

    @Затем("Ввести данные в поле ФИО формы заявки")
    public void nameInput() {
        salePage.nameInput(UserConfig.USER_NAME);
    }

    @Затем("Нажать на выпадающий список направлений деятельности формы заявки")
    public void selectFieldActivities() {
        salePage.selectFieldActivities();
    }

    @Затем("Выбрать из выпадающего списка направлений деятельности 'Фитнес-центр'")
    public void selectFieldActivitiesType() {
        salePage.selectFieldActivitiesType();
    }

    @Затем("Ввести данные в поле email формы заявки")
    public void emailInput() {
        salePage.emailInput(UserConfig.USER_LOGIN);
    }

    @Затем("Нажать на кнопку 'Отправить запрос'")
    public void clickSubmit() {
        salePage.clickSubmit();
    }

    @Затем("Сообщение {string} не видно")
    public void messageIsNotVisible(String text) {
        salePage.messageIsNotVisible();
    }

}

