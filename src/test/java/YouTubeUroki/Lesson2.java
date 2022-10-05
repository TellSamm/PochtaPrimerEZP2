package YouTubeUroki;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson2 {
    public static void main(String[] args) {
        WebDriver Driver = new ChromeDriver();

        Driver.get("http://automationpractice.com/index.php");

        //Первый шаг нашли элемент по Xpath и Кликнули по нему
        Driver.findElement(By.xpath(".//img[@class='item-img'][1]")).click();




    }
}
