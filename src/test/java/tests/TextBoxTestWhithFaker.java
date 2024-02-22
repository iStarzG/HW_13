package test.java.tests;

import org.junit.jupiter.api.Test;
import test.java.pages.TextBoxRegistrationPage;
import test.java.pages.TextBoxSelectPage;
import test.java.pages.components.TestRandomData;

public class TextBoxTestWhithFaker extends test.java.pages.components.TestBase {

    test.java.pages.TextBoxRegistrationPage textBoxPage = new TextBoxRegistrationPage();
    test.java.pages.TextBoxSelectPage textBoxSelect = new TextBoxSelectPage();
    test.java.pages.components.TestRandomData testRandomData = new TestRandomData();


    @Test
    void textBoxWithPages() {
        textBoxPage.openPage()
                .setFirstName(testRandomData.firstName)
                .setEmailName(testRandomData.inputEmail)
                .setCurrentAdress(testRandomData.inputAddress)
                .setPermanentAdress(testRandomData.inputAddress2)
                .submitClick();
        textBoxSelect.nameCheck(testRandomData.firstName)
                .emailCheck(testRandomData.inputEmail)
                .currentAdressCheck(testRandomData.inputAddress)
                .permanentAdressCheck(testRandomData.inputAddress2);

    }
}
