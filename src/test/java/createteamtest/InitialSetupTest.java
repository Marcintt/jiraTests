package createteamtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InitialSetupTest {

    @Test
    public void InitialSetup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(Config.ADDRESS);

        LoginFunction.login(driver, Config.ADMIN_LOGIN, Config.ADMIN_PASSWORD);

        WebElement adminMenuButton = driver.findElement(By.xpath("//a[contains(@id, 'admin_menu')]"));
        adminMenuButton.click();
        WebElement userManagementButton = driver.findElement(By.xpath("//a[contains(@id, 'admin_plugins_menu')]"));
        userManagementButton.click();
        WebElement adminAccessField = driver.findElement(By.xpath("//input[contains(@id, 'login-form-authenticatePassword')]"));
        adminAccessField.sendKeys("admin");
        WebElement confirmButton = driver.findElement(By.xpath("//input[contains(@id, 'login-form-submit')]"));
        confirmButton.click();
        WebElement initialSetpuButton = driver.findElement(By.xpath("//a[contains(@id, 'vm-initial-data-link')]"));
        initialSetpuButton.click();
        WebElement initialSetupHRGroupField = driver.findElement(By.xpath("//input[contains(@id,'aui-group-picker-0')]"));
        initialSetupHRGroupField.sendKeys("HR group");
        WebElement initialSetupNextStep1Button = driver.findElement(By.xpath("//button[@type='submit']"));
        initialSetupNextStep1Button.click();
        WebElement initialSetupNameField = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        initialSetupNameField.sendKeys("Recurring VT");
        //WebElement initialSetupDescriptionField = driver.findElement(By.className("vm-settings-description"));
        //initialSetupDescriptionField.sendKeys("Recurring VT");                                                                Add description field
        WebElement initialSetupTypeRadioButton = driver.findElement(By.xpath("(//input[@name='aui-radio-group-0'])[2]"));
        initialSetupTypeRadioButton.click();
        WebElement initialSetupStartDateField = driver.findElement(By.cssSelector(".aui-date-picker"));
        initialSetupStartDateField.sendKeys("2019-01-01");
        WebElement initialSetupDefaultDayLimit = driver.findElement(By.cssSelector(".short-field"));
        initialSetupDefaultDayLimit.sendKeys("26");
        WebElement initialSetupNextStep2Button = driver.findElement(By.xpath("//button[@type='submit']"));
        initialSetupNextStep2Button.click();
        WebElement initialSetupCreateButton = driver.findElement(By.xpath("//button[@type='submit']"));
        initialSetupCreateButton.click();
        WebElement initialSetupDoneButton = driver.findElement(By.linkText("Done"));
        initialSetupDoneButton.click();

    }
}
