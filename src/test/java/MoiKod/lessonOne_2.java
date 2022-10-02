package MoiKod;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class lessonOne_2 {




    @Test
    public void lessonOne_2(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SChernikov\\Desktop\\Automatization_Test\\chromedriver.exe");
        WebDriver driverNew = new ChromeDriver();

        driverNew.get("https://qa-mesto.praktikum-services.ru/");
        driverNew.findElement(By.id("email")).sendKeys("chernikov.semen21@gmail.com");
        driverNew.findElement(By.id("password")).sendKeys("Hustle260590!");
        driverNew.findElement(By.className("auth-form__button")).click();
        new WebDriverWait(driverNew, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(By.className("header__user")));
        // Кликни по изображению профиля
        driverNew.findElement(By.cssSelector(".profile__image")).click();
        // В поле ссылки на изображение введи ссылку
        driverNew.findElement(By.id("owner-avatar")).sendKeys("https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/avatarSelenium.png");
        // Сохрани новое изображение
        driverNew.findElement(By.xpath(".//form[@name='edit-avatar']/button[text()='Сохранить']")).click();

    }
}
