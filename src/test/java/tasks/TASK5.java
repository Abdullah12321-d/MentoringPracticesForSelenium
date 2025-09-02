package tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TASK5 {
    public static void main(String[] args) throws InterruptedException {
//        Expected Title
//        Erai-raws
// Set Path of the Chrome driver
        WebDriver driver = new ChromeDriver();
// Launch Chrome browser

// Open URL of Website
        driver.get("https://www.erai-raws.info/");
// Maximize Window
        driver.manage().window().maximize();
// Get Title of current Page
        String title = driver.getTitle();
        System.out.println("title = " + title);
// Validate/Compare Page Title
        if (title.equals("Erai-raws")) {
            System.out.println("Correct");


        } else {
            System.out.println("Fules");
        }
// Close Browser

    }

}