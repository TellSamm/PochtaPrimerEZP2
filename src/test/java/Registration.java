import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Registration {


        private By btnSignup = By.xpath("//a[text()='Sign up']");
        private By inputFirstName = By.xpath("//input[@id='user_first_name']");
        private By inputLastName = By.xpath("//input[@id='user_last_name']");
        private By inputEmail = By.xpath("//input[@id='user_email']");
        private By inputUserName = By.xpath("//input[@id='user_username']");
        private By inputPassword = By.xpath("//input[@id='user_password']");
        private By btnJoin = By.xpath("//a[text()='Join']");
        private By btnCopyEmail = By.xpath("//button[@class='btn-rds icon-btn bg-theme click-to-copy']");


        @Test
        public void registration() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\SChernikov\\Desktop\\Automatization_Test\\chromedriver_2.exe");
            WebDriver driverNew = new ChromeDriver();
            driverNew.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));// неявное ожидание * сек Duration - продолжительность

            driverNew.get("https://unsplash.com/");//переход по url
            driverNew.manage().window().maximize();//максимальный (на весь экран)
            driverNew.findElement(btnSignup).click();// клик
            driverNew.findElement(inputFirstName).sendKeys("new3"); //отправляем ключи
            driverNew.findElement(inputLastName).sendKeys("petrovtest3"); //отправляем ключи
            driverNew.switchTo().newWindow(WindowType.TAB).get("https://10minemail.com/ru/");//переходим на сайт с временной почтой в другой вкладке через TAB
            driverNew.findElement(btnCopyEmail).click(); // копируем новую почту

            sleep(3000);

            ArrayList<String> newTab = new ArrayList(driverNew.getWindowHandles());
            driverNew.switchTo().window(newTab.get(0));//указываем первое окно

            driverNew.findElement(inputEmail).sendKeys(Keys.LEFT_CONTROL + "v"); //вставляем скопированный емейл
            driverNew.findElement(inputUserName).sendKeys("SalomonTru"); //отправляем ключи
            driverNew.findElement(inputPassword).sendKeys("234421451"); //отправляем ключи
            driverNew.findElement(btnJoin).click();// клик



            //switch To - переключить на
            //WindowType.TAB - тип окна вкладка и далее .get + "ссылка"
            //driverNew.switchTo().newWindow(WindowType.TAB).get("https://10minemail.com/ru/");





        }


}
