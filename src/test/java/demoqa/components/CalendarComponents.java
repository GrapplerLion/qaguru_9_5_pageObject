package demoqa.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponents {
    private SelenideElement dateInput = $("#dateOfBirthInput");

    public void SafeDate(String day, String month, String year){
        dateInput.click();
        $("[aria-label=\"Choose Thursday, April 21st, 2022\"]").click();
        $("#subjectsInput").setValue("Maths").pressEnter();
        $("[for=hobbies-checkbox-1]").click();
    }
        /*
        $("#dateOfBirthInput").click();
        $("[aria-label=\"Choose Thursday, April 21st, 2022\"]").click();
        $("#subjectsInput").setValue("Maths").pressEnter();
        $("[for=hobbies-checkbox-1]").click();
         */






}
