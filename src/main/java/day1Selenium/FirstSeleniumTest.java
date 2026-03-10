package day1Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        System.out.println("Title: "+driver.getTitle());
        System.out.println("Url  : "+driver.getCurrentUrl());
        driver.quit();

        System.out.println("Execution completed ");

    }
}
