package day10;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tc_LG_001 extends BaseTest{
    @Test
    public void Tc_LG_001(){
        driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("TejaswiniSharma");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("tejaswinisharma1991@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9686705497");
        driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
        driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
        driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("tejaswinisharma1991@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
    }
}
