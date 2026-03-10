package day1Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;


public class WaitsDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Implicit wait — set once
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/login");

        // Login
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Explicit wait — wait for flash message to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement flash = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("flash"))
        );
        System.out.println("Flash visible: " + flash.isDisplayed());
        System.out.println("Flash text   : " + flash.getText().trim());

        // Explicit wait — wait for logout button clickable
        WebElement logout = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[contains(@href,'logout')]")
                )
        );
        System.out.println("Logout clickable: " + logout.isEnabled());

        driver.quit();
    }

}
