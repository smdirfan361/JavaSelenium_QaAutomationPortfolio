package day1Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");


        WebElement byId = driver.findElement(By.id("username"));
        System.out.println("By ID found: " + byId.getTagName());

// Find by name
        WebElement byName = driver.findElement(By.name("username"));
        System.out.println("By Name found: " + byName.getTagName());

// Find by CSS
        WebElement byCss = driver.findElement(By.cssSelector("#username"));
        System.out.println("By CSS found: " + byCss.getTagName());

// Find by XPath
        WebElement byXpath = driver.findElement(By.xpath("//input[@id='username']"));
        System.out.println("By XPath found: " + byXpath.getTagName());

// Find login button by XPath contains
        // Instead of text match — use class or type
        WebElement byXpathBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        System.out.println("Button found: " + byXpathBtn.getText().trim());


        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys("tomsmith");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();

        System.out.println("After Login Title: "+driver.getTitle());
        System.out.println("After login Url: "+driver.getCurrentUrl());

        // Read flash message after login
        WebElement flashMsg = driver.findElement(By.id("flash"));
        System.out.println("Flash message : " + flashMsg.getText().trim());
        System.out.println("Is displayed  : " + flashMsg.isDisplayed());

// Read logout button text
        WebElement logoutBtn = driver.findElement(By.xpath("//a[contains(@href,'logout')]"));
        System.out.println("Logout button : " + logoutBtn.getText().trim());
        System.out.println("Is enabled    : " + logoutBtn.isEnabled());

        driver.quit();


    }
}
