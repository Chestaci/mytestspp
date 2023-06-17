package com.github.Chestaci.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page {
    public final WebDriver driver;
    public final WebDriverWait wait;

    /**
     * Конструктор класса, занимающийся инициализацией полей класса
     */
    public Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(60));
    }
}
