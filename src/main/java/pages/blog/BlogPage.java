package pages.blog;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class BlogPage {
    private final SelenideElement blog = $x("//a[text()='Блог']");
    private final SelenideElement allTags = $x("//span[text()='Все теги']");
    private final SelenideElement tagItem = $x("//a[text()='мифы']");
    private final ElementsCollection titlesOfBlog = $$x("//div[@class='blog-item__title']");

    @Step("Нажать на кнопку 'Блог'")
    public void clickBlogButton() {
        blog.click();
    }

    @Step("Нажать на кнопку 'Все теги'")
    public void clickAllTagsButton() {
        allTags.click();
    }

    @Step("Выбрать из списка тегов 'Мифы'")
    public void chooseTagItemButton() {
        tagItem.click();
    }

    @Step("Проверить наличие хотя бы одной статьи с выбранным тегом")
    public void titlesNotEmpty() {
        titlesOfBlog.shouldHave(CollectionCondition.sizeGreaterThan(0));
    }

}

