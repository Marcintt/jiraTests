package createteamtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateNewVacationTypeTest {
    @Test
    public void AddVacationTypeRecurringYearDaily() {
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
        WebElement vacationTypeButton = driver.findElement(By.xpath("//a[contains(@id, 'vm-manage-vacation-types-link')]"));
        vacationTypeButton.click();
        WebElement addNewVacationTypeButton = driver.findElement(By.xpath("//button[contains(.,'Add new Vacation Type')]"));
        addNewVacationTypeButton.click();
        WebElement addVacationTypeNameField = driver.findElement(By.xpath("//input[contains(@id, 'name')]"));
        addVacationTypeNameField.sendKeys("Recurring year daily");
        WebElement addVacationTypeDescriptionField = driver.findElement(By.xpath("//textarea[contains(@id, 'description')]"));
        addVacationTypeDescriptionField.sendKeys("Recurring year daily");
        WebElement addVacationTypeTypeRadioButton = driver.findElement(By.xpath("(//input[@name='kindType'])[2]"));
        addVacationTypeTypeRadioButton.click();
        WebElement addVacationTypeStartDateField = driver.findElement(By.xpath("//input[contains(@id, 'periodStartDate')]"));
        addVacationTypeStartDateField.sendKeys("2019-01-01");
        WebElement closeCalendar = driver.findElement(By.xpath("//textarea[contains(@id, 'description')]"));//to change
        closeCalendar.click();
        WebElement addVacationTypeDefaultDayLimit = driver.findElement(By.xpath("//input[contains(@name, 'defaultDayLimit')]"));
        addVacationTypeDefaultDayLimit.sendKeys("26");
        WebElement addButton = driver.findElement(By.xpath("//button[contains(@name, 'action')]"));
        addButton.click();

    }

    @Test
    public void AddVacationTypeRecurringYearHalfDay() {
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
        WebElement vacationTypeButton = driver.findElement(By.xpath("//a[contains(@id, 'vm-manage-vacation-types-link')]"));
        vacationTypeButton.click();
        WebElement addNewVacationTypeButton = driver.findElement(By.xpath("//button[contains(.,'Add new Vacation Type')]"));
        addNewVacationTypeButton.click();
        WebElement addVacationTypeNameField = driver.findElement(By.xpath("//input[contains(@id, 'name')]"));
        addVacationTypeNameField.sendKeys("Recurring year halfday");
        WebElement addVacationTypeDescriptionField = driver.findElement(By.xpath("//textarea[contains(@id, 'description')]"));
        addVacationTypeDescriptionField.sendKeys("Recurring year halfday");
        WebElement addVacationTypeTypeRadioButton = driver.findElement(By.xpath("(//input[@name='kindType'])[2]"));
        addVacationTypeTypeRadioButton.click();
        WebElement addVacationTypeStartDateField = driver.findElement(By.xpath("//input[contains(@id, 'periodStartDate')]"));
        addVacationTypeStartDateField.sendKeys("2019-01-01");
        WebElement closeCalendar = driver.findElement(By.xpath("//textarea[contains(@id, 'description')]"));//to change
        closeCalendar.click();
        WebElement addVacationTypeDefaultDayLimit = driver.findElement(By.xpath("//input[contains(@name, 'defaultDayLimit')]"));
        addVacationTypeDefaultDayLimit.sendKeys("26");
        WebElement addVacationTypeTypeVacationRequestPeriod = driver.findElement(By.xpath("//select[contains(@name, 'vacationDocumentPeriodType')]"));
        addVacationTypeTypeVacationRequestPeriod.click();
        WebElement addVacationTypeSelectTypeVacationRequestPeriod = driver.findElement(By.xpath("//option[@value='DAILY_OR_HALF_DAILY']"));
        addVacationTypeSelectTypeVacationRequestPeriod.click();
        WebElement addButton = driver.findElement(By.xpath("//button[contains(@name, 'action')]"));
        addButton.click();
    }

    @Test
    public void AddVacationTypeRecurringYearHourly() {
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
        WebElement vacationTypeButton = driver.findElement(By.xpath("//a[contains(@id, 'vm-manage-vacation-types-link')]"));
        vacationTypeButton.click();
        WebElement addNewVacationTypeButton = driver.findElement(By.xpath("//button[contains(.,'Add new Vacation Type')]"));
        addNewVacationTypeButton.click();
        WebElement addVacationTypeNameField = driver.findElement(By.xpath("//input[contains(@id, 'name')]"));
        addVacationTypeNameField.sendKeys("Recurring year hourly");
        WebElement addVacationTypeDescriptionField = driver.findElement(By.xpath("//textarea[contains(@id, 'description')]"));
        addVacationTypeDescriptionField.sendKeys("Recurring year hourly");
        WebElement addVacationTypeTypeRadioButton = driver.findElement(By.xpath("(//input[@name='kindType'])[2]"));
        addVacationTypeTypeRadioButton.click();
        WebElement addVacationTypeStartDateField = driver.findElement(By.xpath("//input[contains(@id, 'periodStartDate')]"));
        addVacationTypeStartDateField.sendKeys("2019-01-01");
        WebElement closeCalendar = driver.findElement(By.xpath("//textarea[contains(@id, 'description')]"));//to change
        closeCalendar.click();
        WebElement addVacationTypeDefaultDayLimit = driver.findElement(By.xpath("//input[contains(@name, 'defaultDayLimit')]"));
        addVacationTypeDefaultDayLimit.sendKeys("26");
        WebElement addVacationTypeTypeVacationRequestPeriod = driver.findElement(By.xpath("//select[contains(@name, 'vacationDocumentPeriodType')]"));
        addVacationTypeTypeVacationRequestPeriod.click();
        WebElement addVacationTypeSelectTypeVacationRequestPeriod = driver.findElement(By.xpath("//option[@value='DAILY_OR_HOURLY']"));
        addVacationTypeSelectTypeVacationRequestPeriod.click();
        WebElement addButton = driver.findElement(By.xpath("//button[contains(@name, 'action')]"));
        addButton.click();
    }

    @Test
    public void AddVacationTypeOneTimeYearDaily() {
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
        WebElement vacationTypeButton = driver.findElement(By.xpath("//a[contains(@id, 'vm-manage-vacation-types-link')]"));
        vacationTypeButton.click();
        WebElement addNewVacationTypeButton = driver.findElement(By.xpath("//button[contains(.,'Add new Vacation Type')]"));
        addNewVacationTypeButton.click();
        WebElement addVacationTypeNameField = driver.findElement(By.xpath("//input[contains(@id, 'name')]"));
        addVacationTypeNameField.sendKeys("One time year daily");
        WebElement addVacationTypeDescriptionField = driver.findElement(By.xpath("//textarea[contains(@id, 'description')]"));
        addVacationTypeDescriptionField.sendKeys("One time year daily");
        WebElement addVacationTypeDefaultDayLimit = driver.findElement(By.xpath("//input[contains(@name, 'defaultDayLimit')]"));
        addVacationTypeDefaultDayLimit.sendKeys("26");
        WebElement addButton = driver.findElement(By.xpath("//button[contains(@name, 'action')]"));
        addButton.click();

    }

    @Test
    public void AddVacationTypeOneTimeYearHalfDay() {
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
        WebElement vacationTypeButton = driver.findElement(By.xpath("//a[contains(@id, 'vm-manage-vacation-types-link')]"));
        vacationTypeButton.click();
        WebElement addNewVacationTypeButton = driver.findElement(By.xpath("//button[contains(.,'Add new Vacation Type')]"));
        addNewVacationTypeButton.click();
        WebElement addVacationTypeNameField = driver.findElement(By.xpath("//input[contains(@id, 'name')]"));
        addVacationTypeNameField.sendKeys("One time year halfday");
        WebElement addVacationTypeDescriptionField = driver.findElement(By.xpath("//textarea[contains(@id, 'description')]"));
        addVacationTypeDescriptionField.sendKeys("One time year halfday");
        WebElement addVacationTypeDefaultDayLimit = driver.findElement(By.xpath("//input[contains(@name, 'defaultDayLimit')]"));
        addVacationTypeDefaultDayLimit.sendKeys("26");
        WebElement addVacationTypeTypeVacationRequestPeriod = driver.findElement(By.xpath("//select[contains(@name, 'vacationDocumentPeriodType')]"));
        addVacationTypeTypeVacationRequestPeriod.click();
        WebElement addVacationTypeSelectTypeVacationRequestPeriod = driver.findElement(By.xpath("//option[@value='DAILY_OR_HALF_DAILY']"));
        addVacationTypeSelectTypeVacationRequestPeriod.click();
        WebElement addButton = driver.findElement(By.xpath("//button[contains(@name, 'action')]"));
        addButton.click();
    }

    @Test
    public void AddVacationTypeOneTimeYearHourly() {
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
        WebElement vacationTypeButton = driver.findElement(By.xpath("//a[contains(@id, 'vm-manage-vacation-types-link')]"));
        vacationTypeButton.click();
        WebElement addNewVacationTypeButton = driver.findElement(By.xpath("//button[contains(.,'Add new Vacation Type')]"));
        addNewVacationTypeButton.click();
        WebElement addVacationTypeNameField = driver.findElement(By.xpath("//input[contains(@id, 'name')]"));
        addVacationTypeNameField.sendKeys("One time year hourly");
        WebElement addVacationTypeDescriptionField = driver.findElement(By.xpath("//textarea[contains(@id, 'description')]"));
        addVacationTypeDescriptionField.sendKeys("One time year hourly");
        WebElement addVacationTypeDefaultDayLimit = driver.findElement(By.xpath("//input[contains(@name, 'defaultDayLimit')]"));
        addVacationTypeDefaultDayLimit.sendKeys("26");
        WebElement addVacationTypeTypeVacationRequestPeriod = driver.findElement(By.xpath("//select[contains(@name, 'vacationDocumentPeriodType')]"));
        addVacationTypeTypeVacationRequestPeriod.click();
        WebElement addVacationTypeSelectTypeVacationRequestPeriod = driver.findElement(By.xpath("//option[@value='DAILY_OR_HOURLY']"));
        addVacationTypeSelectTypeVacationRequestPeriod.click();
        WebElement addButton = driver.findElement(By.xpath("//button[contains(@name, 'action')]"));
        addButton.click();
    }
}
