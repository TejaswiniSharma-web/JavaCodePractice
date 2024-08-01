package day5;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC_LG_001 extends BaseTest {

    @Test
    public void tC_LG_001() {
        driver.get("https://admin-demo.nopcommerce.com");

        driver.findElement(By.xpath("//input[@id='Email']")).clear();
        driver.findElement(By.xpath("//input[@id='Password']")).clear();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(" admin@yourstore.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }

    @Test
    public void tc_db_002() {


        List<WebElement>listofTitles=     driver.findElements((By.xpath("//ul[@class=\"nav nav-pills nav-sidebar flex-column nav-legacy\"]/li")));
        ArrayList<String>menuItems=new ArrayList<>();

        for (WebElement headings:listofTitles){
            menuItems.add(headings.getText());
            System.out.println(headings.getText());


        }
        System.out.println("*******************");
        Collections.sort(menuItems);

        for (String s:menuItems){
            System.out.println(s);
        }

        //Catalog buttonm
        driver.findElement(By.xpath("(//p[contains(text(),'Catalog')])[1]")).click();
        driver.findElement(By.xpath("//p[text()=' Products']")).click();
        driver.findElement(By.xpath("//input[@id='SearchProductName']")).sendKeys("Computer");
        WebElement element = driver.findElement(By.xpath("//select[@id='SearchCategoryId']"));
        Utility.selectByVisibletext(element,"Computers >> Notebooks");
        WebElement ele = driver.findElement(By.xpath("//select[@id='SearchManufacturerId']"));
        Utility.selectByVisibletext(ele,"Nike");
        WebElement ele2 = driver.findElement(By.xpath("//select[@id='SearchVendorId']"));
        Utility.selectByVisibletext(ele2,"Vendor 2");
        WebElement ele3 = driver.findElement(By.xpath("//select[@id='SearchWarehouseId']"));
        Utility.selectByVisibletext(ele3,"Warehouse 2 (Los Angeles)");
        WebElement ele4=driver.findElement(By.xpath("//select[@id='SearchProductTypeId']"));
        Utility.selectByVisibletext(ele4,"Grouped (product with variants)");
        WebElement ele5=driver.findElement(By.xpath("//select[@id='SearchPublishedId']"));
        Utility.selectByVisibletext(ele5,"Unpublished only");
        driver.findElement(By.xpath("//button[@id='search-products']")).click();

    }


    }
