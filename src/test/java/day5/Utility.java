package day5;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility {


    public static void selectByVisibletext(WebElement element,String text){
        Select select=new Select(element);
        select.selectByVisibleText(text);

    }
}
