package steps.feedback;

import config.UserConfig;
import io.cucumber.java.ru.Затем;
import pages.feedback.FeedbackPage;

public class FeedbackPageDef {
    FeedbackPage feedbackPage = new FeedbackPage();

    @Затем("Нажать на кнопку 'О компании'")
    public void clickButton() {
        feedbackPage.clickButton();
    }

    @Затем("Нажать на кнопку 'Все отзывы'")
    public void clickFeedback() {
        feedbackPage.clickFeedback();
    }

    @Затем("Нажать на кнопку 'Оставить отзыв о магазине'")
    public void clickFeedbackButton() {
        feedbackPage.clickFeedbackButton();
    }


    @Затем("Ввести данные в поле 'Ваше имя'")
    public void inputAuthorName() {
        feedbackPage.inputAuthorName(UserConfig.USER_NAME);
    }

    @Затем("Нажать на кнопку 'Отправить'")
    public void clickButtonSubmit() {
        feedbackPage.clickButtonSubmit();
    }

    @Затем("Сообщение {string} видно")
    public void contentIsVisible(String text) {
        feedbackPage.contentIsVisible();
    }

}
