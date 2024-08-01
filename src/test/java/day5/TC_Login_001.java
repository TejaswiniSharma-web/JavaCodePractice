package day5;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_Login_001 extends BaseTest{
    @Test
    public void tC_Login_001() {
        driver.get("https://admin-demo.nopcommerce.com");

        driver.findElement(By.xpath("//input[@id='Email']")).clear();
        driver.findElement(By.xpath("//input[@id='Password']")).clear();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(" admin@yourstore.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }
    @Test
    public void InvalidLogin(){
        driver.get("");
        driver.findElement(By.xpath("//input[@class='email valid']")).clear();

    }
}
