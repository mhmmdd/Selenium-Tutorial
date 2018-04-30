package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLException;

public class Runner {
    public static void main(String[] args) throws InterruptedException, SQLException {
        System.setProperty("webdriver.chrome.driver", "D:\\web\\java\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String title=driver.getTitle();
        System.out.println(title);
    }
}
