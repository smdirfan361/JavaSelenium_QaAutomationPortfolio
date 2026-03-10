package day1Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");


        WebElement username = driver.findElement(By.id("username"));
        System.out.println("Username field found: "+username.isDisplayed());

        WebElement password = driver.findElement(By.id("password"));
        System.out.println("Username field found: "+password.isDisplayed());

        WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit'"));
        System.out.println("Login button found: "+loginBtn.isDisplayed());

        WebElement loginBtnXpath = driver.findElement(By.xpath("//button[@type='submit']"));
        System.out.println("Login button found via xpath: "+loginBtnXpath.isDisplayed());

        driver.quit();


    }
}
