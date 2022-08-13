package com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GmailTest {

    public static GmailHelper gmailHelper;

    private String email = "vovabala82@gmail.com";
    private String password = "_Vovabala828282";
    private String recipientEmail = "balasevolodimir@gmail.com";
    private String theme = "Text for balase";
    private String text = "Hello vova";


    @BeforeClass
    public static void init() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        gmailHelper = new GmailHelper(driver);
    }

    @Test
    public void sendMail() {
        gmailHelper.openPage();
        gmailHelper.inputEmailField(email);
        gmailHelper.inputPasswordField(password);
        gmailHelper.buttonWriteClick();
        gmailHelper.recipientEmailField(recipientEmail);
        gmailHelper.writeTheme(theme);
        gmailHelper.writeText(text);
        gmailHelper.buttonSendClick();
    }

}
