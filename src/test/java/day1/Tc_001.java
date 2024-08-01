package day1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Tc_001 extends BaseTest {
    @Test
    public void openUrl() throws InterruptedException {

        driver.findElement(By.id("acceptAllBtn")).click();
        driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("Bangalore");
        driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("Delhi");
        WebElement calenderElement=driver.findElement(By.cssSelector("#calanderDiv"));
        calenderElement.click();

       List<WebElement> cal =  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));

       for(WebElement x : cal){
           if(x.getText().equals("31")){
               x.click();
               break;
           }
       }
       Thread.sleep(2000);
       WebElement ele= driver.findElement(By.xpath("(//button[@class='close close-visiblity closePaxModal'])[1]"));
        ele.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='passengers']")).click();
        Thread.sleep(2000);
       driver.findElement(By.id("adds_adult")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//button[@id='adds_child']")).click();
     WebElement ele1=   driver.findElement(By.xpath("//button[@class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']"));
     ele1.click();
    WebElement element= driver.findElement(By.xpath("//button[text()='Search Flights']"));
    element.click();


    }
}
