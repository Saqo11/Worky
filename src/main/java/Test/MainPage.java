package Test;

import BasePages.LoginBase;
import BasePages.TaskBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainPage {
    WebDriver driver;
   public LoginBase loginbase;
   public TaskBase taskBase;

/////////////
    @BeforeEach
    public void start() {
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    loginbase = PageFactory.initElements(driver,LoginBase.class);
    taskBase = PageFactory.initElements(driver,TaskBase.class);

       }

  /* @AfterEach

    public  void Finish(){
    driver.quit();



    }
*/
}