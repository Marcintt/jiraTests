package createteamtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFunction {
    static public void login(WebDriver driver, String userLogin, String userPassword) {

        WebElement loginTopButton = driver.findElement(By.xpath("//a[contains(@class,'login-link')]"));
        loginTopButton.click();
        WebElement userNameField = driver.findElement(By.xpath("//input[contains(@id, 'login-form-username')]"));
        // userNameField.click();
        userNameField.sendKeys(userLogin);
        WebElement passwordField = driver.findElement(By.xpath("//input[contains(@id, 'login-form-password')]"));
        passwordField.sendKeys(userPassword);
        WebElement loginButton = driver.findElement(By.xpath("//input[contains(@id, 'login-form-submit')]"));
        loginButton.click();
    }
}
