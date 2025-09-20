package week2_Tasks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class task2W2Mod {
    /*
    Question: Navigate to "https://demoqa.com/radio-button". Create a test that:
    Attempts to select each radio button (Yes, Impressive, No)
    Prints whether each option is enabled/disabled
    For enabled options, select them and verify selection
    Print confirmation message for each successful selection
     */
    @Test
            void task1(){
        driver.get("https://demoqa.com/radio-button");
        WebElement yes = driver.findElement(By.xpath("//*[@for='yesRadio']"));
        WebElement impressive = driver.findElement(By.xpath("//*[@for='impressiveRadio']"));
        WebElement no = driver.findElement(By.xpath("//*[@for='noRadio']"));
        System.out.println("Yes enabled: " + yes.isSelected());
        System.out.println("Impressive enabled: " + impressive.isSelected());
        System.out.println("No enabled: " + no.isSelected());

        if (!yes.isSelected()) {
            yes.click();
            Assertions.assertEquals("Yes",driver.findElement(By.xpath("//span[@class='text-success']")).getText(),"not selected");
            System.out.println("Yes selected successfully");
        }

        if (!impressive.isSelected()) {
            impressive.click();
            Assertions.assertEquals("Impressive",driver.findElement(By.xpath("//span[@class='text-success']")).getText(),"not selected");
            System.out.println("Impressive selected successfully");
        }

//            if (!no.isSelected()){
//                no.click();
//                Assertions.assertEquals("No",driver.findElement(By.xpath("//span[@class='text-success']")).getText(),"not selected");
//                System.out.println("Impressive selected successfully");
//            } else {
//                System.out.println("No is disabled, cannot select");
//            }




    }






    WebDriver driver;
    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
