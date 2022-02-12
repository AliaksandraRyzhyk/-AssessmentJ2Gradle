package steps.blog;

import io.cucumber.java.ru.Затем;
import pages.blog.BlogPage;

public class BlogPageDef {
    BlogPage blogPage = new BlogPage();


    @Затем("Нажать на кнопку 'Блог'")
    public void clickBlogButton() {
        blogPage.clickBlogButton();
    }

    @Затем("Нажать на кнопку 'Все теги'")
    public void clickAllTagsButton() {
        blogPage.clickAllTagsButton();
    }

    @Затем("Выбрать из списка тегов 'Мифы'")
    public void chooseTagItemButton() {
        blogPage.chooseTagItemButton();
    }

    @Затем("Проверить наличие хотя бы одной статьи с выбранным тегом")
    public void getMainTitles() {
        blogPage.titlesNotEmpty();
    }

}
