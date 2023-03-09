package demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import demoqa.components.CalendarComponents;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static demoqa.docs.RandomUtilsExample.getRandomLong;

public class RegistrationsPage {
    // locators % elements
    private final String FORM_TITLE = "Student Registration Form";
    private SelenideElement
            formtitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmail = $("#userEmail"),
            userPhone = $("#userNumber"),
            userSubject = $("#subjectsInput"),
            userPicture = $("#uploadPicture"),
            userAdd = $("#currentAddress"),
            userState = $("#react-select-3-input"),
            userCity = $("#react-select-4-input"),
            resultsTable = $(".modal-content");

    public CalendarComponents calendar = new CalendarComponents();
    // actions

    public RegistrationsPage openPage(){
        open("https://demoqa.com/automation-practice-form");
        $(formtitle).shouldHave(text(FORM_TITLE));
        return this;
    }
    public RegistrationsPage typeFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }
    public RegistrationsPage typeLastName(String value){
     lastNameInput.setValue(value);
     return this;
    }
    public RegistrationsPage typeEmailInput(String value){
        userEmail.setValue(value);
        return this;
    }
    public RegistrationsPage typeUserPhone(String value){
        userPhone.setValue(value);
        return this;
    }
    public RegistrationsPage typeUserSubject(String value){
        userSubject.setValue(value).pressEnter();
        return this;
    }
    public RegistrationsPage typeUserPicture(String value){
        userPicture.uploadFromClasspath(value);
        return this;
    }
    public RegistrationsPage typeUserAdresse(String value){
        userAdd.setValue(value);
        return this;
    }
    public RegistrationsPage typeUserState(String value){
        userState.setValue(value).pressEnter();

        return this;
    }
    public RegistrationsPage typeUserCity(String value){
        userCity.setValue(value).pressEnter();

        return this;
    }
    public RegistrationsPage checkResultsValue(String key, String value){
        resultsTable.$(byText(key)).parent().shouldHave(text(value));

        return this;
    }







}






























