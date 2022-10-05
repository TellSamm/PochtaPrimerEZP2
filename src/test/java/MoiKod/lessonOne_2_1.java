package MoiKod;

import org.junit.After;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class lessonOne_2_1 {




    @Test
    public void lessonOne_2(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SChernikov\\Desktop\\Automatization_Test\\chromedriver.exe");
        WebDriver driverNew = new ChromeDriver();

        driverNew.get("https://qa-mesto.praktikum-services.ru/");
        // Выполни авторизацию
        driverNew.findElement(By.id("email")).sendKeys("chernikov.semen21@gmail.com");
        driverNew.findElement(By.id("password")).sendKeys("Hustle260590!");
        driverNew.findElement(By.className("auth-form__button")).click();
        new WebDriverWait(driverNew,Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("header__user")));
        // Кликни по кнопке добавления нового контента
        driverNew.findElement(By.xpath(".//button[@class='profile__add-button']")).click();
        // В поле названия введи Москва
        driverNew.findElement(By.xpath(".//input[@class='popup__input popup__input_type_card-name']")).sendKeys("Москва");
        // В поле ссылки на изображение введи ссылку
        driverNew.findElement(By.xpath(".//input[@class='popup__input popup__input_type_url']")).sendKeys("https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/photoSelenium.jpg");
        // Сохрани контент
        driverNew.findElement(By.xpath(".//form[@name='new-card']/button[text()='Сохранить']")).click();
        // Дождись появления кнопки удаления карточки
        new WebDriverWait(driverNew,Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//button[@class='card__delete-button card__delete-button_visible']")));
        // Удали контент
        driverNew.findElement(By.xpath(".//button[@class='card__delete-button card__delete-button_visible']")).click();
    }

}
