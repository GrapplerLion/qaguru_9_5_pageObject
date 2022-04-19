package demoqa.test3;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class DemoTest {

    @Test
    void fillFornTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Bananchik");
        $("#lastName").setValue("jeltov");
        $("#userEmail").setValue("kojura1@mail.ru");
        $("[for=gender-radio-2]").click();
        $("#userNumber").setValue("12345678911");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("April");
        $(".react-datepicker__year-select").selectOption("2021");
        $(".react-datepicker__day react-datepicker__day--020:not(react-datepicker__day--selected react-datepicker__day--today)").click();



        $("[for=gender-radio-2]").click();
    }
}

