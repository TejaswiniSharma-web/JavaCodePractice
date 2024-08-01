package day11;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddNewContact extends BaseTest2 {
    @Test
    public void addNewContact() {
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        LoginUser lg=new LoginUser();
        lg.loginUser();
        driver.findElement(By.xpath("//button[text()='Add a New Contact']")).click();
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Tejaswini");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("sharma");
        driver.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("1996-12-20");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("wecax12260@morxin.com");
        driver.findElement(By.xpath("//input[@id='street1']")).sendKeys("hoskarehalli");
        driver.findElement(By.xpath("//input[@id='street2']")).sendKeys("Bamgalore");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Bangalore");
        driver.findElement(By.xpath("//input[@id='stateProvince']")).sendKeys("Karnataka");
        driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("560085");
        driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
    }
}