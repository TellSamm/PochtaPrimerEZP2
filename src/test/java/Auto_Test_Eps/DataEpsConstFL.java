package Auto_Test_Eps;

import org.openqa.selenium.By;

public class DataEpsConstFL {

    //Для изменения тестирования с (тестового) окружения на (прод) меняем переменные геттеры ---> ((logInTelephoneProd,inputPasswordProd,buttonJoinGosuslugiProd))

    public String url = "https://zakaznoe.pochta.ru/";


    public String urlTest = "https://erl-individual-web.test.russianpost.ru/";

    public By radioButtonPrivatePerson = By.xpath("(//span[@style='margin-right: 15px;'])[2]");

    public By ButtonPrivatePerson = By.xpath("//div[@class = 'switcherItemsWrapper']");

    public By lastNameInput = By.xpath("(//div[@class='text-input__wrapper ']/input[contains(@class, 'text-input')])[1]");
    public By buttonJoinEPS = By.xpath("//a[text() ='Войти' and @class ='header__link color-accent hover-underline']");

    public By logInTelephoneProd = By.xpath("//input[@class = 'plain-input'][1]");

    public By logInTelephoneTest = By.xpath("//dl[@class='flt-lbl-box login']//input[@id='login']");

    public By inputPasswordProd = By.xpath("//input[@class = 'plain-input']");

    public By inputPasswordTest = By.xpath("//input[@id='password']");

    public String userPhone = "89850310707";

    public String userPassword = "Hustle260590!";

    public By buttonJoinGosuslugiProd = By.xpath("//button[text()=' Войти ']");

    public By buttonJoinGosuslugiTest = By.xpath("//button[@id='loginByPwdButton']");

    public By buttonPay = By.xpath("//button[@class='create-mail-form__button ']");

    public By buttonOK = By.xpath("//button[text()=' Ок ']");

    public By buttonNewLetter = By.xpath("//button[text()='Новое письмо']");

    public By inputRecipient = By.xpath("(//input[@value=''])[2]");

    public String organization = "Организация";

    public By addRecipientManually = By.className("hand__choice-title");

    public By clickFreePlace = By.xpath("//html");

    public By inputAddressRecipient = By.xpath("(//input[@value=''])[2]");

    public By inputAddressSender = By.xpath("(//div[@class='text-input__wrapper ']/input[contains(@class,'text')])[3]");

    public By buttonAddRecipient = By.xpath("//button[contains(@class, 'add-new-receiver')]");

    public String pathFile = "C:\\Users\\SChernikov\\IdeaProjects\\PochtaPrimerEZP2\\src\\imgs\\1280x1024.jpg";


    String AddressRecipient = "429620, Чувашия. Чувашская Республика, р-н. Красноармейский, с. Красноармейское, ул. Новая, д. 6";

    String senderAddress = "429620, Чувашия. Чувашская Республика, р-н. Красноармейский, с. Красноармейское, ул. Новая, д. 6";
}
