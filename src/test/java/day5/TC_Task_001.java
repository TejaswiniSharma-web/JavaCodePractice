package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TC_Task_001 extends BaseTest{
    @Test
    public void openWixipidea(){
        driver.get("https://www.wikipedia.org");
        List<WebElement>listOfLanguages=driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));
        ArrayList<String>languages=new ArrayList<>();
        for (WebElement ele:listOfLanguages){
            languages.add(ele.getText());
            System.out.println(ele.getText());
        }
       System.out.println("*****************");
        Collections.sort(languages);
        for (String lan:languages){
            System.out.println(lan);

        }
        System.out.println("Count: "+ languages.size());
    }
}
