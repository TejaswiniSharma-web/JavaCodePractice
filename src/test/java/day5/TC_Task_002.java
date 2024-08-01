package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TC_Task_002 extends BaseTest{
    @Test
    public void openGoDigit(){
        driver.get("https://www.godigit.com/");
        WebElement ele=driver.findElement(By.xpath("(//a[@class='qf-switcher'])[4]"));
        Actions act=new Actions(driver);
        act.moveToElement(ele).click().build().perform();
        driver.findElement(By.xpath("//a[text()='Country']")).click();
        List<WebElement>allOptions=driver.findElements(By.xpath("//ul/li/a[@class='ng-binding']"));
        for (WebElement countries:allOptions){
            if (countries.getText().equals("France") || countries.getText().equals("Spain") || countries.getText().equals("Canada")) {
                countries.click();
              //  break;
            }
        }
        driver.findElement(By.xpath("//input[@id='departure-date']")).click();
        driver.findElement(By.xpath("(//tbody/tr/td/button[text()='21'])[1]")).click();

      WebElement returnDate=  driver.findElement(By.xpath("(//tbody/tr/td/button[text()='2'])[1]"));
        Actions act1=new Actions(driver);
        act1.moveToElement(returnDate).click().build().perform();
        driver.findElement(By.xpath("//button[text()='Get Quote']")).click();

    }
}
