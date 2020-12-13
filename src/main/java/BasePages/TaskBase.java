package BasePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TaskBase extends  BasePage{
    String SITE_URL = "http://worky-reppy-dev.esterox.org/en/tasks";

    public TaskBase(WebDriver driver) {
        super(driver);
    }
     public TaskBase goTO () {
         driver.get(SITE_URL);
         return this;

     }
     public TaskBase removeElements (){

        try {
            if( driver.findElement(By.xpath("//span[@class='iconWrapper___at7Wi']")).isDisplayed() ) {
                click(By.xpath("//span[@class='iconWrapper___at7Wi']"));





            }


        }
         catch (Exception e){


         }
         return  this;




     }








}
