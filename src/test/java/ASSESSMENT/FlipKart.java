package ASSESSMENT;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FlipKart  extends BaseTest{
    @Test
    public void launchBrowser() throws InterruptedException {
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone",Keys.ENTER);
        List<WebElement>iphones=driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
       int countTotalNumberIphones=iphones.size();
       System.out.println(countTotalNumberIphones);
       List<WebElement>links=driver.findElements(By.xpath("//a[@class='CGtC98']"));
        for (WebElement numberOflinks:links){
           System.out.println(numberOflinks.getText());
        }

        driver.quit();
    }


}
