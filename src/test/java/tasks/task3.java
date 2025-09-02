package tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3 {
    public static void main(String[] args) throws InterruptedException  {
        WebDriver driver = new ChromeDriver();

//        Task2:
//•Open URL: https://www.google.com/
        driver.get("https://www.google.com/");
//•Maximize the window.
        Thread.sleep(3000);
        driver.manage().window().maximize();
//•Print the position and size of the page.
        int Height =  driver.manage().window().getSize().height;
       int Width =  driver.manage().window().getSize().width;
        System.out.println("Height = "+ Height);
        System.out.println("Width = "+ Width);
        int x = driver.manage().window().getPosition().x;
        int y = driver.manage().window().getPosition().y;
        System.out.println("x = "+ x);
        System.out.println("y = "+ y);
//
//•Minimize the page.

        driver.manage().window().minimize();
//•Wait 5 seconds in the icon state and maximize the page.
        Thread.sleep(5000);
        driver.manage().window().maximize();
//•Print the position and dimensions of the page in maximized state.
        System.out.println("Height = "+ Height);
        System.out.println("Width = "+ Width);
        System.out.println("x = "+ x);
        System.out.println("y = "+ y);
//•Make the page fullscreen.
        driver.manage().window().fullscreen();
//•Close the Browser.

        driver.quit();









    }
}
