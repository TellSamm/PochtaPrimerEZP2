package Auto_Test_Eps;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;


import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class AddMaxUsersYl extends DataEpsConstYL {


    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    private By fileAdd = By.xpath("(//input[contains(@accept, 'application/pdf')])[2]");

    @Test
    public void loginNewLetterEPS() throws InterruptedException {

        DataEpsConstYL dataInput = new DataEpsConstYL();

        driver.navigate().to(dataInput.urlTest);
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
        driver.findElement(dataInput.inputRecipient).sendKeys(dataInput.organization + "1");
        wait.until(presenceOfElementLocated(dataInput.addRecipientManually));
        driver.findElement(dataInput.addRecipientManually).click();
        driver.findElement(dataInput.inputAddressRecipient).sendKeys(dataInput.AddressRecipient);
        driver.findElement(dataInput.clickFreePlace).click();
//        driver.findElement(fileAdd).sendKeys(dataInput.pathFile);
        driver.findElement(dataInput.inputAddressSender).sendKeys(dataInput.senderAddress);
        driver.findElement(dataInput.clickFreePlace).click();
        //driver.findElement(dataInput.buttonAddRecipient).click();

        //Цикл на добавление получателей
        for (int i = 2; i <= 30; i++){
            driver.findElement(dataInput.buttonAddRecipient).click();
            driver.findElement(dataInput.inputRecipient).sendKeys(dataInput.organization + " " + i);
            Thread.sleep(800);
            wait.until(presenceOfElementLocated(dataInput.addRecipientManually));
            driver.findElement(dataInput.addRecipientManually).click();
            driver.findElement(dataInput.inputAddressRecipient).sendKeys(dataInput.AddressRecipient, Keys.ENTER, Keys.TAB);
            Thread.sleep(500);
        }
        //System.out.println("Test 200 OK!");

        //Добавление файла
        driver.findElement(fileAdd).sendKeys(dataInput.pathFile);
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(200))
        .until(ExpectedConditions.elementToBeClickable(dataInput.buttonPay)));
        Thread.sleep(8000);
        driver.findElement(dataInput.buttonPay).click();

        //Оплата картой
        WebElement element_2 = (new WebDriverWait(driver, Duration.ofSeconds(200))
                .until(ExpectedConditions.visibilityOfElementLocated(dataInput.inputNumberCard)));
        driver.findElement(dataInput.inputNumberCard).sendKeys(dataInput.cartNumber);
        driver.findElement(dataInput.inputExpiryDate).sendKeys(dataInput.cardExpiryDate);
        driver.findElement(dataInput.inputCvvCard).sendKeys(dataInput.cvvCard);
        driver.findElement(By.id("OK")).click();

//        driver.findElement(By.id("forceRedirect")).click();
    }
}
