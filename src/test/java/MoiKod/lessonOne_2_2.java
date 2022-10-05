package MoiKod;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class lessonOne_2_2 {
    private final String email;
    private final String password;
    private final boolean isLoggedIn;

    public lessonOne_2_2(String email, String password, boolean isLoggedIn) {
        this.email = email;
        this.password = password;
        this.isLoggedIn = isLoggedIn;
    }

    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][] {
                //Сгенерируй тестовые данные (свою учётку и несколько случайных)
                {"chernikov.semen21@gmail.com", "Hustle260590!", true},
                {"qwerty@gmail.com", "Pw123456", true},
                {"email2@test.example", "password2", false}
        };

    }

    @Test
    public void lessonOne_2_2(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SChernikov\\Desktop\\Automatization_Test\\chromedriver.exe");
        WebDriver driverNew = new ChromeDriver();

        driverNew.get("https://qa-mesto.praktikum-services.ru/");
        driverNew.findElement(By.id("email")).sendKeys(email);
        driverNew.findElement(By.id("password")).sendKeys(password);
        driverNew.findElement(By.className("auth-form__button")).click();
        if (isLoggedIn) {
            new WebDriverWait(driverNew,Duration.ofSeconds(3))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.className("header__user")));
        }
        assertEquals(isLoggedIn, driverNew.findElement(By.className("profile")).isDisplayed());
        driverNew.findElements(By.cssSelector(".profile__image"));
        driverNew.quit();
    }
}
