package pages.feedback;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$x;

public class FeedbackPage {
    private final SelenideElement shopsButton = $x("//a[text()='О компании']");
    private final SelenideElement feedback = $x("//a[text()='Все отзывы']");
    private final SelenideElement feedbackButton = $x("//span[text()='Оставить отзыв о магазине']");
    private final SelenideElement authorName = $x("//input[@name='author_name']");
    private final SelenideElement buttonSubmit = $x("(//button[@type='submit'])[2]");
    private final SelenideElement messageError = $x("//div[text()='Ошибка добавления отзыва']");

    @Step("Нажать на кнопку 'О компании'")
    public void clickButton() {
        shopsButton.click();
    }

    @Step("Нажать на кнопку 'Все отзывы'")
    public void clickFeedback() {
        feedback.click();
    }

    @Step("Нажать на кнопку 'Оставить отзыв о магазине'")
    public void clickFeedbackButton() {
        feedbackButton.click();
    }

    @Step("Ввести данные в поле 'Ваше имя'")
    public void inputAuthorName(String text){
        authorName.val(text);
    }

    @Step("Нажать на кнопку 'Отправить'")
    public void clickButtonSubmit(){
        buttonSubmit.click();
    }

    @Step("Проверить видимость сообщения об ошибке добавления отзыва")
    public void contentIsVisible() {
        messageError.shouldBe(Condition.visible);
    }

}
