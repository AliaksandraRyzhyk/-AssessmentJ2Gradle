package pages.sales;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$x;

public class SalePage {
    private final SelenideElement saleButton = $x("(//a[@class='nav__link'])[8]");
    private final SelenideElement nameInput = $x("//input[@id='form_opt_FIELD_TITLE']");
    private final SelenideElement fieldActivities = $x("//select[@id='form_opt_FIELD_ACTIVITIES']");
    private final SelenideElement fieldActivitiesType = $x("//form[@id='form_opt']//option[@value='Фитнес-центр']");
    private final SelenideElement emailInput = $x("//input[@id='form_opt_FIELD_EMAIL']");
    private final SelenideElement submit = $x("//form[@id='form_opt']//button[@class='submit-button']");
    private final SelenideElement message = $x("//div[text()='Ваше сообщение отправлено. Мы свяжемся с вами в течение 2х часов']");


    @Step("Нажать на кнопку 'Оптовикам'")
    public void clickButton() {
        saleButton.click();
    }

    @Step("Ввести {0} в поле ФИО формы заявки")
    public void nameInput(String text) {
        nameInput.val(text);
    }

    @Step("Нажать на выпадающий список направлений деятельности формы заявки")
    public void selectFieldActivities() {
        fieldActivities.click();
    }

    @Step("Выбрать из выпадающего списка направлений деятельности 'Фитнес-центр'")
    public void selectFieldActivitiesType() {
        fieldActivitiesType.click();
    }

    @Step("Ввести {0} в поле email формы заявки")
    public void emailInput(String text) {
        emailInput.val(text);
    }

    @Step("Нажать на кнопку 'Отправить запрос'")
    public void clickSubmit() {
        submit.click();
    }

    @Step("Проверить невидимость сообщения о корректно внесенных данных")
    public void messageIsNotVisible() {
        message.shouldNotBe(Condition.visible);
    }
}

