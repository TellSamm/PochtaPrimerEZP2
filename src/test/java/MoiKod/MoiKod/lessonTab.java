package MoiKod.MoiKod;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class lessonTab {




    @Test
    public void lessonTab() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SChernikov\\Desktop\\Automatization_Test\\chromedriver_2.exe");
        WebDriver driverNew = new ChromeDriver();

        driverNew.get("https://vk.com/");// открываем сайт
        driverNew.manage().window().maximize();// на весь экран
        driverNew.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);// невявное ожидаеие в 3 сек

        driverNew.navigate().to("https://www.gismeteo.ru/weather-cheboksary-4361/");//переходим на следующий сайт
        String gerUrlGismeteo = driverNew.getCurrentUrl();//getCurrentUrl - получить текущий URL-адрес
        Assert.assertEquals(gerUrlGismeteo, "https://www.gismeteo.ru/weather-cheboksary-4361/");// проверяем что мы действительно перешли по указанной ссылке

        driverNew.navigate().back();// назад
        String getUrlVK = driverNew.getCurrentUrl(); //getCurrentUrl - получить текущий URL-адрес
        driverNew.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);// невявное ожидаеие в 3 сек
        Assert.assertEquals(getUrlVK, "https://vk.com/");// проверяем что мы действительно перешли по указанной ссылке

        String getTitle = driverNew.getTitle(); // проверка что текст вкладки (название вкладки) соответствует
        Assert.assertEquals(getTitle, "Добро пожаловать | ВКонтакте");

        driverNew.navigate().refresh();
        driverNew.navigate().forward();


    }
}
