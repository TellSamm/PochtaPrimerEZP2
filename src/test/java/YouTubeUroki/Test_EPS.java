package YouTubeUroki;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class Test_EPS extends Data_EPS {


    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    private By fileAdd = By.xpath("//input[contains(@accept, 'application/pdf')]");

    @Test
    public void loginNewLetterEPS() throws InterruptedException {

        Data_EPS dataInput = new Data_EPS();

        driver.navigate().to(dataInput.getUrlTest);
        driver.manage().window().maximize();
        driver.findElement(dataInput.buttonJoinEPS).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(dataInput.logInTelephoneTest).sendKeys(dataInput.userPhone);
        driver.findElement(dataInput.inputPasswordTest).sendKeys(dataInput.userPassword);
        //WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(200))
                //.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Войти ']"))));
        Thread.sleep(1000);
        driver.findElement(dataInput.buttonJoinGosuslugiTest).click();
        driver.findElement(dataInput.buttonOK).click();
        driver.findElement(dataInput.buttonNewLetter).click();
        driver.findElement(dataInput.inputRecipient).sendKeys(dataInput.organization);
        wait.until(presenceOfElementLocated(dataInput.addRecipientManually));
        driver.findElement(dataInput.addRecipientManually).click();
        driver.findElement(dataInput.inputAddressRecipient).sendKeys(dataInput.AddressRecipient);
        driver.findElement(dataInput.clickFreePlace).click();
        driver.findElement(fileAdd).sendKeys(dataInput.pathFile);
        driver.findElement(dataInput.inputAddressSender).sendKeys(dataInput.senderAddress);
        driver.findElement(dataInput.clickFreePlace).click();
        //driver.findElement(dataInput.buttonAddRecipient).click();
        for (int i = 1; i < 10; i++){
            driver.findElement(dataInput.buttonAddRecipient).click();
            driver.findElement(dataInput.inputRecipient).sendKeys(dataInput.organization + " " + i);
            wait.until(presenceOfElementLocated(dataInput.addRecipientManually));
            driver.findElement(dataInput.addRecipientManually).click();
            Thread.sleep(8000);
            driver.findElement(dataInput.inputAddressRecipient).sendKeys(dataInput.AddressRecipient);
            driver.findElement(dataInput.clickFreePlace).click();
            //driver.findElement(dataInput.inputAddressSender).sendKeys(dataInput.senderAddress);
            //driver.findElement(dataInput.clickFreePlace).click();
        }

        System.out.println("Test 200 OK!");
        //driver.quit();
        //доделаем позжее

    }
}
