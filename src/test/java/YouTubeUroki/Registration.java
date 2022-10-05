package YouTubeUroki;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration extends Data_Registration{

    private By buttonJoin = By.xpath("//a[@class='cLLOA p1cWU jpBZ0 EzsBC KHq0c XHI2L'][2]");
    private By InputFirstName = By.id("user_first_name");
    private By InputLastName = By.id("user_last_name");
    private By InputEmail = By.id("user_email");
    private By InputUserName = By.id("user_username");
    private By InputUserPassword = By.id("user_password");
    private By buttonJoinCompleteRegistration = By.xpath("//a[@class='btn btn-default btn-block-level js-fake-join-form-submit-button']");

   @Test

    public void registration(){

       WebDriver driver = new ChromeDriver();
       Data_Registration getDate = new Data_Registration();

       driver.get(getDate.getUrl);
       driver.findElement(buttonJoin).click();
       driver.findElement(InputFirstName).sendKeys(getDate.firstName);
       driver.findElement(InputLastName).sendKeys(getDate.lastName);
       driver.findElement(InputEmail).sendKeys(getDate.email);
       driver.findElement(InputUserName).sendKeys(getDate.userName);
       driver.findElement(InputUserPassword).sendKeys(getDate.password);
       driver.findElement(buttonJoinCompleteRegistration).click();


    }

}
