package BasePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class LoginBase extends BasePage{
 String SITE_URL = ("http://worky-reppy-dev.esterox.org/en/login?from=%2Fen%2Ftasks");


public LoginBase(WebDriver driver) {
        super(driver);
    }
public LoginBase goTo (){
      driver.get(SITE_URL);
      return this;

    }
public LoginBase chooseTask (){
     click(By.xpath("//*[@id=\"root\"]/div[2]/form/div[3]/button"));
     return this;


    }
public LoginBase isCorrect (){

    isElementDisplayed(By.xpath("//span[@class='iconButton___1jRTl ant-badge']"));
    return this;

   }
public LoginBase login (String login)  {

    driver.findElement(By.id("email")).sendKeys(login);

    return this;
   }

public LoginBase pass (String pass)  {

        driver.findElement(By.id("password")).sendKeys(pass);

        return this;
    }


    public LoginBase emailMessage(){

        isElementDisplayed(By.xpath("//*[@id=\"root\"]/div[2]/form/div[1]/div/div/div"));
        return this;

    }public LoginBase loginMessage(){

        isElementDisplayed(By.xpath("//*[@id=\"root\"]/div[2]/form/div[2]/div/div/div"));
        return this;

    }


}
