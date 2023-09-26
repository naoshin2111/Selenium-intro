package seleniumElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class LocatorsInitial {
    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("naoshinhridi");
        driver.findElement(By.name("inputPassword")).sendKeys("helloWorld!");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p[class='error']")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("naoshin21@g.com");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
    }
}
