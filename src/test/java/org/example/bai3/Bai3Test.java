package org.example.bai3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Bai3Test {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeEach
    void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    void aoNam(){
        driver.get("https://vitimex.com.vn/");
        driver.get("https://vitimex.com.vn/collections/ao-nam");
        driver.get("https://vitimex.com.vn/products/ao-so-mi-ngan-tay-nam-vat-bang-dang-om-vua-slimfit-vitimex-asb-7825");
        driver.findElement(By.cssSelector("40")).click();
    }

    @AfterEach
    void teardown(){
        driver.quit();
    }
}
