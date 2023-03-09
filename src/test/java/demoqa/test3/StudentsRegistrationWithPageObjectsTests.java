package demoqa.test3;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Locale;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class StudentsRegistrationWithPageObjectsTests extends TestBase {

    Faker faker = new Faker(new Locale("en-IND"));
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String fullName = firstName + " " + lastName;
    String userEmail = faker.internet().emailAddress();
    String streetAdd = faker.address().streetAddress();
    //String userPhone = faker.phoneNumber().phoneNumber();
    String userMobileNumber = "0123456789";



    @Test
    void fillFormTest() {

        registrationsPage.openPage()
                         .typeFirstName(firstName)
                         .typeLastName(lastName)
                         .typeEmailInput(userEmail)
                         .typeUserPhone(userMobileNumber);

        $$(".custom-radio").get(1).click();

        registrationsPage.calendar.setDate("30", "July", "2008");

        registrationsPage.typeUserSubject("Maths");
        $(byText("Sports")).click();

        registrationsPage.typeUserPicture("1.png");

        registrationsPage.typeUserAdresse(streetAdd)
                         .typeUserState("Uttar Pradesh")
                         .typeUserCity("Agra");


        $("#submit").click();

        registrationsPage.checkResultsValue("Student Name", fullName)
                .checkResultsValue("Student Email", userEmail)
                .checkResultsValue("Gender", "Female")
                .checkResultsValue("Mobile", userMobileNumber)
                .checkResultsValue("Date of Birth", "30 July,2008")
                .checkResultsValue("Subjects", "Maths")
                .checkResultsValue("Hobbies", "Sports")
                .checkResultsValue("Picture", "1.png")
                .checkResultsValue("Address", streetAdd)
                .checkResultsValue("State and City", "Uttar Pradesh Agra");


    }
}

