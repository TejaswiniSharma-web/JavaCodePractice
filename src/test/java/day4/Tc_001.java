package day4;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Tc_001 extends BaseTest{
    @Test
    public void tc_001(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//a[@class='close'])[1]")).click();
       /* driver.findElement(By.xpath("(//a[text()='Apply Online'])[1]")).click();
        WebElement mainMenu= driver.findElement(By.xpath("(//a[text()='Savings Account'])[2]"));
        Actions actions=new Actions(driver);
        actions.moveToElement(mainMenu).click().build().perform();
        driver.findElement(By.xpath("//input[@name='btnOpenaccount']")).click();
        driver.findElement(By.xpath("//div[@class='inputField mobFld align-center']")).sendKeys();
*/
        driver.findElement(By.xpath("(//a[text()='Digital Banking'])[1]")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Consumer']")).click();
        WebElement mainElement=  driver.findElement(By.xpath("//a[text()='IndusPay']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(mainElement).click().build().perform();
    }
}
