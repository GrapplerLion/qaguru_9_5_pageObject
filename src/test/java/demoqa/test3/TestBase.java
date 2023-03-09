package demoqa.test3;

import com.codeborne.selenide.Configuration;
import demoqa.pages.RegistrationsPage;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    RegistrationsPage registrationsPage = new RegistrationsPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1800";
    }
}
