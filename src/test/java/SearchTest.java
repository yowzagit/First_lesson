 import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
 import static com.codeborne.selenide.Selenide.*;

 public class SearchTests {

        @Test
        void selenideSearchTest() {
            open("https://www.google.com/");

            $(byName("q")).setValue("Selenide without registration and sms").pressEnter();

            $("#search").shouldHave(text("selenide.org"));

            sleep(5432);
            //5 sec wait, because you wonderful!
        }
    }

