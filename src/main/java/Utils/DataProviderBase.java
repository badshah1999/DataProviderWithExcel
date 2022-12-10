package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProviderBase {
    /**
     * This code will pass the arguments to the required fields
     **/
    @Test(dataProvider = "data", dataProviderClass = ReadCode.class)
    public void signup(String data[]) {
        System.setProperty("webdriver.chrome.driver","/Users/badshah.p/IdeaProjects/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(data[0]);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(data[1]);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        String title = driver.getTitle();
        System.out.println("Title:" + title);
    }
}
