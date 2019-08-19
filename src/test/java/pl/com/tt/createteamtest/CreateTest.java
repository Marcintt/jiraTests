package pl.com.tt.createteamtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateTest {
    @Test
    public void testCreateTeam(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;

        driver.get("http://192.168.192.253:8080");
        WebElement loginTopButton = driver.findElement(By.xpath("//a[contains(@class,'login-link')]"));
        loginTopButton.click();
        WebElement userNameField = driver.findElement(By.xpath("//input[contains(@id, 'login-form-username')]"));
       // userNameField.click();
        userNameField.sendKeys("admin");
        WebElement passwordField = driver.findElement(By.xpath("//input[contains(@id, 'login-form-password')]"));
        passwordField.sendKeys("admin");
        WebElement loginButton = driver.findElement(By.xpath("//input[contains(@id, 'login-form-submit')]"));
        loginButton.click();
        WebElement VMTopMenuButton = driver.findElement(By.xpath("//a[contains(@id,'vm-top-menu')]"));
        VMTopMenuButton.click();
        WebElement MenuManagementButton = driver.findElement(By.xpath("//a[contains(@id,'vm-top-item-6_lnk')]"));
        MenuManagementButton.click();
        WebElement TeamsButton = driver.findElement(By.xpath("//a[contains(@href, 'VacationManager.ManageTeams.jspa')]"));
        TeamsButton.click();
        WebElement NewTeamButton = driver.findElement(By.xpath("//button[@name='newTeamButton']"));
        NewTeamButton.click();
        WebElement newTeamName = driver.findElement(By.xpath("//input[@name='name']"));
        newTeamName.sendKeys(("team5"));
        WebElement newTeamDescription = driver.findElement(By.xpath("//textarea[@name='description']"));
        newTeamDescription.sendKeys(("team5 description"));
        WebElement createButton = driver.findElement(By.xpath("//button[@name='submitButton']"));
        createButton.click();
        WebElement addSupervisorButton = driver.findElement(By.xpath("//a[@name='addMemberButton']"));
        addSupervisorButton.click();
        WebElement userPicker = driver.findElement(By.xpath("//a[contains(@href, 'VM$.openUserPickerWindow('userNames');)]"));
        userPicker.click();




    }
}
