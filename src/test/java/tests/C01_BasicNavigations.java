package tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_BasicNavigations {

// Invoke Chrome Browser
// Navigate to URL: https://www.w3schools.com/
// Navigate to URL: https://stackoverflow.com/
// Come back to the w3schools using the back command.
// Again go back to the stackoverflow website using forward command
// Refresh the Browser using refresh command.
// Close the Browser.


    // Go to the w3school URL : https://www.w3schools.com/
// Print the position and size of the page.
// Adjust the position and size of the page as desired.
// Test that the page is in the position and size you want.
// Close the page.


    // Invoke Chrome Browser
// Open URL: https: https://www.w3schools.com/
// Maximize the window.
// Print the position and size of the page.
// Minimize the page.
// Wait 7 seconds in the icon state and maximize the page.
// Print the position and dimensions of the page in maximized state.
// Make the page fullscreen.
// Close the Browser.




    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();












































//        driver.get("https://www.google.com/");
//        System.out.println(driver.manage().window().getPosition());
//        System.out.println(driver.manage().window().getSize());
//        Thread.sleep(3000);
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//        System.out.println(driver.manage().window().getPosition());
//        Thread.sleep(3000);
//        System.out.println(driver.manage().window().getSize());
//
//
//        // Print the position and size of the page.
//        // Minimize the page.
//        // Wait 7 seconds in the icon state and maximize the page.
//        // Print the position and dimensions of the page in maximized state.
//        // Make the page fullscreen.
//        Thread.sleep(3000);
//        driver.manage().window().fullscreen();
//
//        // Close the Browser.
//        Thread.sleep(3000);
//        driver.quit();








    }













//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.w3schools.com/");
//        int height = driver.manage().window().getSize().height;
//        int width = driver.manage().window().getSize().width;
//        System.out.println("height = "+ height);
//        System.out.println("height = "+ width);
//
//        int x = driver.manage().window().getPosition().x;
//        int y = driver.manage().window().getPosition().y;
//        System.out.println("x= "+ x);
//        System.out.println("y = "+ y);
//
//
//
//        Thread.sleep(3000);
//         Adjust the position and size of the page as desired.
//        driver.manage().window().setPosition(new Point(100, 10));
//        Thread.sleep(100);
//        driver.manage().window().setPosition(new Point(200, 10));
//        Thread.sleep(100);
//        driver.manage().window().setPosition(new Point(300, 10));
//        Thread.sleep(100);
//        driver.manage().window().setPosition(new Point(400, 10));
//        Thread.sleep(3000);
//        driver.manage().window().setSize(new Dimension(945, 500));
//
//         Test that the page is in the position and size you want.
//        int newHeight = driver.manage().window().getSize().height;
//        int newWidth = driver.manage().window().getSize().width;
//
//        int newX = driver.manage().window().getPosition().x;
//        int newY = driver.manage().window().getPosition().y;
//
//        if (newHeight == 500 && newWidth == 945 && newX == 400 && newY == 10) {
//            System.out.println("Test Passed!");
//        } else {
//            System.err.println("Test Failed!");
//        }
//        driver.quit();



































//        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
//        Thread.sleep(3000);

//        String title = driver.getTitle();
//        System.out.println("Title = " + title);


      //  if (title.equals("Contact List App")){
//            System.out.println("test passed");
//
//
//        } else { System.err.println("test is failed");
//
//        }
//
//        Thread.sleep(3000);
//        driver.quit();

    }

