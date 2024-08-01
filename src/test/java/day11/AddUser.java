package day11;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddUser extends BaseTest2{
    @Test
    public void openURl(){
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        driver.findElement(By.xpath("//button[text()='Sign up']")).click();
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("teju");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("sharma");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("socices933@eqvox.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("tejuSharma@1461");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
    }
}
