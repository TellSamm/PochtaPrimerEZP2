import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class lessonOne {




    @Test
    public void lessonOne(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SChernikov\\Desktop\\Automatization_Test\\chromedriver_2.exe");
        WebDriver driverNew = new ChromeDriver();

        driverNew.get("https://grinfer.com/");
        driverNew.manage().window().maximize();

        String getTitle = driverNew.getTitle();
        Assert.assertEquals(getTitle, "Top Online Courses | Grinfer"); // перевод: Утверждать. утверждать равно

        String gerUrl = driverNew.getCurrentUrl();
        Assert.assertEquals(gerUrl, "https://grinfer.com/");

        String a = "first";//просто добавил изменения для github проверки
        String getPage = driverNew.getPageSource();// метод для вывода всего Html кода страницы
        System.out.println("!!Каша просто каша по городу яхай !!получилось!!" + getPage); // выводим этот html код
        driverNew.close();





    }
}
