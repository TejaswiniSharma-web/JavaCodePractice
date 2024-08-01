package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class InterviewPrograms {
    protected WebDriver driver;
    @Test
    public  void openUrl(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https:www.google.com");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Software Testing Jobs at Bangalore", Keys.ENTER);
        List<WebElement> elements=driver.findElements(By.tagName("a"));
        for (WebElement ele:elements){

            System.out.println(ele.getAttribute("href"));


        }




driver.quit();
    }
}
