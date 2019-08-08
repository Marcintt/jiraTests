package createteamtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddHRGroup {

    @Test
    public void AddHRGroup() {
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
        WebElement groupsButton = driver.findElement(By.xpath("//a[contains(@id, 'group_browser')]"));
        groupsButton.click();
        WebElement groupNameField = driver.findElement(By.name("addName"));
        groupNameField.sendKeys("HR group");
        WebElement addGroupButton = driver.findElement(By.name("add_group"));
        addGroupButton.click();
        WebElement editMembersButton = driver.findElement(By.xpath("//a[contains(@id, 'edit_members_of_HR group')]"));
        editMembersButton.click();
        WebElement addAdminToGroup = driver.findElement(By.name("usersToAssignStr"));
        addAdminToGroup.click();
        addAdminToGroup.sendKeys("admin");
        WebElement addSelectedUsersButton = driver.findElement(By.xpath("//input[contains(@id, 'add-users-to-selected-groups')]"));
        addSelectedUsersButton.click();
    }
}
