package Test;

import BasePages.TaskBase;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TaskPage<List> extends MainPage{



   @BeforeEach
    public void mainTask(){
       loginbase.goTo()
               .login("utest202010@gmail.com")
               .pass("12345678")
               .chooseTask()
               .isCorrect();

       taskBase    .goTO();



   }
   @Test
    public  void Positive (){

          taskBase          .removeElements();
       boolean Hover = false;
       java.util.List<WebElement> Tusks = driver.findElements(By.xpath("//*[@id=\"primaryLayout\"]/main/div/div[4]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[5]/div/div[2]/span[2]"));
       int size = Tusks.size();
       for (int i=0; i<size; i++){
           // hover(By.xpath("//*[@id=\"primaryLayout\"]/main/div/div[4]/div/div/div/div/div/div/div/table/tbody/tr[1]"));


           Tusks.get(i).click();

       }


   }










}
