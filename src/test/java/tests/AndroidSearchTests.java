package tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;

import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class AndroidSearchTests extends TestBase {

    @Tag("android")
    @Test
    @Story("Checking search possibilities in wikipedia")
    void searchTestAppium() {
          back();
        //     switchTo().alert().accept();
        step("Type search", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        });
        step("Verify content found", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));
    }

    @Tag("android")
    @Test
    @Story("Checking tabs on the start page wikipedia")
    void checkSearchTabTest() {
       back();
        step("Click on search tab", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/nav_tab_search")).click();
        });
        step("Check the opened page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/history_title")).shouldHave(Condition.text("History"));
        });
    }

    @Tag("android")
    @Test
    @Story("Checking tabs on the start page wikipedia")
    void checkSavedTabTest() {
        back();
        step("Click on saved tab", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/nav_tab_reading_lists")).click();
        });
        step("Check the saved page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/positiveButton")).shouldHave(Condition.text("LOG IN / JOIN WIKIPEDIA"));
        });
    }
}



