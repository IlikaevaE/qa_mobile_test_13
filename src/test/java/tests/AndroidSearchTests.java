package tests;

import io.appium.java_client.AppiumBy;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;


/* Данный код не работает, если подключена зависимость "com.codeborne:selenide:$selenideVersion", +
 * Appium версия для этого кода нужна - appiumVersion = "7.6.0", */


public class AndroidSearchTests extends TestBase {
    @Test
    void searchTest() {
        step("Type search", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text"))
                    .sendKeys("BrowserStack");
        });

        step("Verify content found", () -> {
            $$(AppiumBy.id("org.wikipedia.alpha:id/view_card_header_title"))
                    .shouldHave(sizeGreaterThan(0));
        });
    }

    @Test
    void searchTestWiki() {
        step("Type search", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text"))
                    .sendKeys("Selenide");
        });

        step("Verify content found", () -> {
            $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                    .shouldHave(sizeGreaterThan(0));
        });
    }
}

