package createteamtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddUsersTest {


        @Test
        public void AddUsersTest() {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get(Config.ADDRESS);

            LoginFunction.login(driver, Config.ADMIN_LOGIN, Config.ADMIN_PASSWORD);

        WebElement adminMenuButton = driver.findElement(By.xpath("//a[contains(@id, 'admin_menu')]"));
        adminMenuButton.click();
        WebElement userManagementButton = driver.findElement(By.xpath("//a[contains(@id, 'admin_users_menu')]"));
        userManagementButton.click();
        WebElement adminAccessField = driver.findElement(By.xpath("//input[contains(@id, 'login-form-authenticatePassword')]"));
        adminAccessField.sendKeys("admin");
        WebElement confirmButton = driver.findElement(By.xpath("//input[contains(@id, 'login-form-submit')]"));
        confirmButton.click();
        WebElement createUserButton = driver.findElement(By.xpath("//a[contains(@id, 'create_user')]"));
        createUserButton.click();
        WebElement createAnotherButton = driver.findElement(By.xpath("//input[contains(@id, 'user-create-createAnother')]"));
        createAnotherButton.click();


        int userCount = 4;
        String usersTab[] = {
                "Adrian",
                "Mia",
                "Przemion",
                "Tomas"
        };

        for (int i = 1; i <= userCount; i++) {
            WebElement emailField = driver.findElement(By.xpath("//input[contains(@id, 'user-create-email')]"));
            WebElement fullNameField = driver.findElement(By.xpath("//input[contains(@id, 'user-create-fullname')]"));
            WebElement createUserNameField = driver.findElement(By.xpath("//input[contains(@id, 'user-create-username')]"));
            WebElement createPasswordField = driver.findElement(By.xpath("//input[contains(@id, 'password')]"));
            WebElement createCreateUserButton = driver.findElement(By.xpath("//input[contains(@id, 'user-create-submit')]"));

            emailField.clear();
            fullNameField.clear();
            createUserNameField.clear();
            createPasswordField.clear();

            emailField.sendKeys("mailuser" + i + "@mail.com");
            fullNameField.sendKeys("User " + usersTab[i - 1]);
            createUserNameField.sendKeys("user " + i);
            createPasswordField.sendKeys("admin");

            if (i == userCount) {
                driver.findElement(By.xpath("//input[contains(@id, 'user-create-createAnother')]")).click();

            }
            createCreateUserButton.click();

        }


    }
}
