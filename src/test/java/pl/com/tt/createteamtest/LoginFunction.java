package pl.com.tt.createteamtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFunction {
    static public void login(WebDriver driver, String userLogin, String userPassword) {

        WebElement loginTopButton = driver.findElement(By.xpath("//a[contains(@class,'login-link')]"));
        loginTopButton.click();
        WebElement userNameField = driver.findElement(By.xpath("//input[contains(@id, 'login-form-username')]"));
        userNameField.sendKeys(userLogin);
        WebElement passwordField = driver.findElement(By.xpath("//input[contains(@id, 'login-form-password')]"));
        passwordField.sendKeys(userPassword);
        WebElement loginButton = driver.findElement(By.xpath("//input[contains(@id, 'login-form-submit')]"));
        loginButton.click();
    }

    static public void administratorAccessFunction(WebDriver driver, String userPassword) {
        WebElement adminMenuButton = driver.findElement(By.xpath("//a[contains(@id, 'admin_menu')]"));
        adminMenuButton.click();
        WebElement userManagementButton = driver.findElement(By.xpath("//a[contains(@id, 'admin_plugins_menu')]"));
        userManagementButton.click();
        WebElement adminAccessField = driver.findElement(By.xpath("//input[contains(@id, 'login-form-authenticatePassword')]"));
        adminAccessField.sendKeys("admin");
        WebElement confirmButton = driver.findElement(By.xpath("//input[contains(@id, 'login-form-submit')]"));
        confirmButton.click();
    }
}
