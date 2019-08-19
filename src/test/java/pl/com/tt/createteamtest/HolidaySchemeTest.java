package pl.com.tt.createteamtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HolidaySchemeTest {
    @Test
    public void AddHolidayScheme() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(Config.ADDRESS);

        LoginFunction.login(driver, Config.ADMIN_LOGIN, Config.ADMIN_PASSWORD);
        WebElement topMenuVacationsButton = driver.findElement(By.xpath("//a[contains(@id, 'vm-top-menu')]"));
        topMenuVacationsButton.click();
        WebElement managementButton = driver.findElement(By.xpath("//a[contains(@id, 'vm-top-item-6_lnk')]"));
        managementButton.click();

        int HolidaySchemeCount = 20;

        for (int i = 1; i <= HolidaySchemeCount; i++) {

            WebElement holidaySchemeButton = driver.findElement(By.linkText("Holiday schemes"));
            holidaySchemeButton.click();
            WebElement addHolidaySchemeButton = driver.findElement(By.xpath("//button[contains(@name, 'addNewHolidaySchemeButton')]"));
            addHolidaySchemeButton.click();


            WebElement holidaySchemeNameField = driver.findElement(By.xpath("//input[contains(@name, 'newHolidaySchemeName')]"));
            holidaySchemeNameField.sendKeys("Holiday Scheme " + i);
            WebElement createButton = driver.findElement(By.xpath("//button[contains(@name, 'submitButton')]"));
            createButton.click();
        }
    }

    @Test
    public void AddHolidayToSchemeTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(Config.ADDRESS);

        LoginFunction.login(driver, Config.ADMIN_LOGIN, Config.ADMIN_PASSWORD);
        WebElement topMenuVacationsButton = driver.findElement(By.xpath("//a[contains(@id, 'vm-top-menu')]"));
        topMenuVacationsButton.click();
        WebElement managementButton = driver.findElement(By.xpath("//a[contains(@id, 'vm-top-item-6_lnk')]"));
        managementButton.click();
        WebElement holidaySchemeButton = driver.findElement(By.linkText("Holiday schemes"));
        holidaySchemeButton.click();
        WebElement addHolidayButton = driver.findElement(By.xpath("//button[contains(@name, 'addHolidayButton')]"));
        addHolidayButton.click();
        WebElement dayField = driver.findElement(By.xpath("//input[contains(@id, 'addHolidayDialogDay')]"));
        dayField.sendKeys("12252019");
        WebElement holidayNameField = driver.findElement(By.xpath(("//input[contains(@id, 'addHolidayDialogName')]")));
        holidayNameField.sendKeys("Christmas");
        WebElement typeRadioButton = driver.findElement(By.xpath("(//input[contains(@name, 'yearly')])[2]"));
        typeRadioButton.click();
        WebElement addButton = driver.findElement(By.xpath("//button[contains(@id, 'addHolidayDialogSubmit')]"));
        addButton.click();

    }

    @Test
    public void copyHolidaySchemeTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(Config.ADDRESS);

        LoginFunction.login(driver, Config.ADMIN_LOGIN, Config.ADMIN_PASSWORD);
        WebElement topMenuVacationsButton = driver.findElement(By.xpath("//a[contains(@id, 'vm-top-menu')]"));
        topMenuVacationsButton.click();
        WebElement managementButton = driver.findElement(By.xpath("//a[contains(@id, 'vm-top-item-6_lnk')]"));
        managementButton.click();
        WebElement holidaySchemeButton = driver.findElement(By.linkText("Holiday schemes"));
        holidaySchemeButton.click();
        WebElement copyButton = driver.findElement(By.xpath("//a[contains(@scheme-id, '1')]"));
        copyButton.click();

        WebElement createCopyButton = driver.findElement(By.xpath("//button[contains(@name,'submitButton')]"));
        createCopyButton.click();

    }

    @Test
    public void deleteMainScreenHolidayScheme() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(Config.ADDRESS);

        LoginFunction.login(driver, Config.ADMIN_LOGIN, Config.ADMIN_PASSWORD);
        WebElement topMenuVacationsButton = driver.findElement(By.xpath("//a[contains(@id, 'vm-top-menu')]"));
        topMenuVacationsButton.click();
        WebElement managementButton = driver.findElement(By.xpath("//a[contains(@id, 'vm-top-item-6_lnk')]"));
        managementButton.click();
        WebElement holidaySchemeButton = driver.findElement(By.linkText("Holiday schemes"));
        holidaySchemeButton.click();
        WebElement deleteMainScreenButton = driver.findElement(By.xpath("(//a[@name='deleteHolidaySchemeButton'])[2]"));
        // delete third element
        deleteMainScreenButton.click();
        WebElement deleteButtonInWarningButton = driver.findElement(By.xpath("(//button[@name='submitButton'])[3]"));
        deleteButtonInWarningButton.click();
    }

    @Test
    public void deleteInDetailHolidayScheme() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(Config.ADDRESS);

        LoginFunction.login(driver, Config.ADMIN_LOGIN, Config.ADMIN_PASSWORD);
        WebElement topMenuVacationsButton = driver.findElement(By.xpath("//a[contains(@id, 'vm-top-menu')]"));
        topMenuVacationsButton.click();
        WebElement managementButton = driver.findElement(By.xpath("//a[contains(@id, 'vm-top-item-6_lnk')]"));
        managementButton.click();
        WebElement holidaySchemeButton = driver.findElement(By.linkText("Holiday schemes"));
        holidaySchemeButton.click();
        WebElement forthItemInHSDetails = driver.findElement(By.linkText("Holiday Scheme7"));
        forthItemInHSDetails.click();
        WebElement deleteInDetailHSButton = driver.findElement(By.linkText("Delete holiday scheme"));
        deleteInDetailHSButton.click();
        WebElement deleteButtonInWarningButton = driver.findElement(By.xpath("(//button[@name='submitButton'])[2]"));
        deleteButtonInWarningButton.click();
    }
}
