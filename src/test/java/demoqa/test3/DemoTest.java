package demoqa.test3;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class DemoTest {
    @BeforeAll
    static void beforeAll() {Configuration.startMaximized=true;}

    @Test
    void fillFornTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Bananchik");
        $("#lastName").setValue("jeltov");
        $("#userEmail").setValue("kojura1@mail.ru");
        $("[for=gender-radio-2]").click();
        $("#userNumber").setValue("12345678911");
        $("#dateOfBirthInput").click();
        $("[aria-label=\"Choose Thursday, April 21st, 2022\"]").click();
        $("#subjectsInput").setValue("Maths").pressEnter();
        $("[for=hobbies-checkbox-1]").click();
        $("#uploadPicture").uploadFromClasspath(("img/1.png"));
        $("#currentAddress").setValue("Some Street 1");
        $(".body-height").scrollTo();
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $(".body-height").scrollTo();
        $("#submit").click();

        $("#submit").click();


    }
}

