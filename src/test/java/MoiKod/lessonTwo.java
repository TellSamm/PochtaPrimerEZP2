package MoiKod;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class lessonTwo {

    @Test
    public void lessonTwo(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SChernikov\\Desktop\\Automatization_Test\\chromedriver_2.exe");
        WebDriver driverNew = new ChromeDriver();

        driverNew.get("https://github.com/TellSamm");
        Cookie getCookie = new Cookie("user_session","0BCfg70gQdCmrKwZyl9brp9cSkH6zXlX_nLYYLxg24CyITTd"); //добавляем куки для того что бы зайти без логопасов
        driverNew.manage().addCookie(getCookie);//добавляем куки для того что бы зайти без логопасов
        driverNew.navigate().refresh();// рефрешим страницу
        Set<Cookie> cookies_1 = driverNew.manage().getCookies();// метод что бы передать (вытянуть) куки
        System.out.println("Cookoie =======>" + cookies_1); // ну и печатаем куки в консоль любимую родную




    }
}
