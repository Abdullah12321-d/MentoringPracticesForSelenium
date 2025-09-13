package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirestTest


        // Go to www.yahoo.com
// Maximize Window
// Go to www.amazon.com
// Maximize Window
// Navigate Back
// Navigate Forward
// Refresh The Page

{
     public static void main(String[] args) throws InterruptedException {


         WebDriver driver = new ChromeDriver();
         driver.get("https://www.yahoo.com/");
         Thread.sleep(3000);
         driver.manage().window().maximize();
         Thread.sleep(3000);
         driver.get("https://www.google.com/");
         Thread.sleep(3000);
         driver.navigate().back();
         Thread.sleep(3000);
         driver.navigate().forward();
         Thread.sleep(3000);
         driver.navigate().refresh();
         Thread.sleep(3000);




         driver.close();



     }


}
