package tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class AndroidSearchTests extends TestBase {

    @Tag("android")
    @Test
    void searchTestAppium() {
       // back();
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
    void gettingTest() {
        // back();
        step("Type search", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/view_announcement_action_negative")).click();

        });
        step("Checking the page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/view_card_header_title")).shouldHave(Condition.text("Featured article"));
        });
    }


}



