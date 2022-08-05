package com.geekbrains.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AfishaTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.afisha.ru/");

        driver.findElement(By.xpath("//input[@placeholder='Событие, актер, место']")).sendKeys
                ("пес-призрак");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[.='пес-призрак']")));
        //webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[.='пес-призрак']"))));
        driver.findElement(By.xpath("//div[.='пес-призрак']")).click();

        Thread.sleep(5000);
        driver.quit();



        
    }
}
