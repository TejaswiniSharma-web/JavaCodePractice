package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginUser extends BaseTest2{
    @Test
    public void loginUser(){
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("socices933@eqvox.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("tejuSharma@1461");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

    }
}
