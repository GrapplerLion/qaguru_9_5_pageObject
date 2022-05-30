package demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationsPage {
    // locators & elements
    private final String FORM_TITLE = "Student Registration Form";
    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName");

    // actions
    public void OpenPage() {
        open("https://demoqa.com/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
    }

    public RegistrationsPage typeFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationsPage typeLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }


    //
    //$("#lastName").setValue("jeltov");
}
