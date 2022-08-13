package com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GmailHelper {
    private WebDriver driver;
    private WebDriverWait waiter;
    private String baseUrl;

    public GmailHelper(WebDriver driver) {
        this.driver = driver;
        this.waiter = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.baseUrl = "https://gmail.com";
    }

    public void openPage() {
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    public void inputEmailField(String email) {

        WebElement emailField = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='identifierId']")));
        emailField.sendKeys(email);

        WebElement buttonNext = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Далее']")));
        buttonNext.click();
    }

    public void inputPasswordField(String password) {

        WebElement passwordField = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']")));
        passwordField.sendKeys(password);

        WebElement buttonNext = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Далее']")));
        buttonNext.click();
    }


    public void buttonWriteClick() {

        WebElement buttonWrite = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Написать']")));
        buttonWrite.click();
    }

    public void recipientEmailField(String friendsEmail) {

        WebElement friendsEmailField = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@name='to']")));
        friendsEmailField.sendKeys(friendsEmail);
    }

    public void writeTheme(String theme) {

        WebElement themeField = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='subjectbox']")));
        themeField.sendKeys(theme);
    }

    public void writeText(String textEmail) {

        WebElement textField = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")));
        textField.sendKeys(textEmail);
    }

    public void buttonSendClick() {

        WebElement buttonSend = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")));
        buttonSend.click();
    }
}

