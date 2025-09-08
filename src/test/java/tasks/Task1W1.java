package tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1W1 {
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new FirefoxDriver();

        // Invoke FireFox Driver
        driver.get("https://www.firefox.com/ar/");



// Go to https://www.youtube.com/
        driver.get(" https://www.youtube.com/");

// Maximize the window
        driver.manage().window().maximize();

// Verify the page title contains the word video.
        String title = driver.getTitle();
        System.out.println("Title = " + title);
        if (title.equals("video")){
            System.out.println("test passed");



          } else { System.err.println("test is failed");


        }

// Minimize the window
        driver.manage().window().minimize();


// Verify the page title contains the word video.

        if (title.equals("video")){
            System.out.println("test passed");



        } else { System.err.println("test is failed");


        }
// Make the page fullscreen
        driver.manage().window().fullscreen();

// Close the driver.
        driver.quit();



    }




}