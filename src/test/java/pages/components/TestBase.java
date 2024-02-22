package test.java.pages.components;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
     //   Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000;
       // System.out.println("\n\nDemoQA Test Started!\n");


    }
}