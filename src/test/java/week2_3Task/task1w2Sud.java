package week2_3Task;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;





public class task1w2Sud {
    static WebDriver driver;


    @BeforeAll
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Implicit wait is for the initial element search
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Explicit wait is for a specific condition to be met

    }

    @Test
    void nav() throws InterruptedException {
        // TODO: Navigate to test pages
        driver.get("https://testpages.eviltester.com/styled/index.html");

        // TODO: Click on "Locators - Find By Playground Test Page"
        driver.findElement(By.partialLinkText("Find By Playground")).click();

        // TODO: Print current URL
        String url1 = driver.getCurrentUrl();
        System.out.println("current URL = " + url1);
        Assertions.assertEquals("https://testpages.eviltester.com/styled/find-by-playground-test.html", url1);

        // TODO: Navigate back
        driver.navigate().back();

        // TODO: Print URL after going back
        String url2 = driver.getCurrentUrl();
        System.out.println("URL after going back = " + url2);

        // TODO: Click on "WebDriver Example Page"
        driver.findElement(By.partialLinkText("WebDriver Example Page")).click();

        // TODO: Print current URL
        String url3 = driver.getCurrentUrl();
        System.out.println("current URL = " + url3);

        // TODO: Enter value 20 in number input
        WebElement num = driver.findElement(By.xpath("//input[@name='number-entry']"));
        num.sendKeys("20");
        WebElement processButton = driver.findElement(By.id("submit-to-server"));
        processButton.click();
        Thread.sleep(3000);
        // TODO: Verify 'two, zero' message appears
        WebElement messageElement = driver.findElement(By.id("message"));
        String messageText = messageElement.getText();

        System.out.println("message text = " + messageText);
        Assertions.assertEquals("two, zero", messageText, "Verify 'two, zero' message is displayed");
    }

    @AfterAll
    public static void tearDown() throws InterruptedException {
        // Close driver
        Thread.sleep(3000);
        driver.quit();
    }


}











































//    static WebDriver driver;
//    static WebDriverWait wait;
//
//    @BeforeAll
//    public static void setUp() {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        // Implicit wait is for the initial element search
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        // Explicit wait is for a specific condition to be met
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    }
//
//    @Test
//    void nav(){
//        // Navigate to test pages
//        driver.get("https://testpages.eviltester.com/styled/index.html");
//
//        // Click on "Locators - Find By Playground Test Page"
//        driver.findElement(By.partialLinkText("Find By Playground")).click();
//
//        // Print current URL
//        String url1 =  driver.getCurrentUrl();
//        System.out.println("current URL = " + url1);
//        Assertions.assertEquals("https://testpages.eviltester.com/styled/find-by-playground-test.html", url1);
//
//        // Navigate back
//        driver.navigate().back();
//
//        // Print URL after going back
//        String url2 = driver.getCurrentUrl();
//        System.out.println("URL after going back = " + url2);
//
//        // Click on "WebDriver Example Page"
//        driver.findElement(By.partialLinkText("WebDriver Example Page")).click();
//
//        // Print current URL
//        String url3 = driver.getCurrentUrl();
//        System.out.println("current URL = " + url3);
//
//        // Enter value 20 in number input and click the "Process On Server" button
//        WebElement num = driver.findElement(By.xpath("//input[@name='number-entry']"));
//        num.sendKeys("20");
//
//        // Find the "Process On Server" button by its ID and click it
//        WebElement processButton = driver.findElement(By.id("submit-to-server"));
//        processButton.click();
//
//        // Use explicit wait to ensure the message element is visible and has text
//        // This line will wait for a new element with the ID "message" to appear on the page
//        WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
//        String messageText = messageElement.getText();
//
//        System.out.println("message text = " + messageText);
//        Assertions.assertEquals("two, zero", messageText, "Verify 'two, zero' message is displayed");
//    }
//
//    @AfterAll
//    public static void tearDown() throws InterruptedException {
//        // Close driver
//        Thread.sleep(3000);
//        driver.quit();
//    }
//    @Test
//            void nav(){
//// TODO: Navigate to test pages
//    driver.get("https://testpages.eviltester.com/styled/index.html");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//// TODO: Click on "Locators - Find By Playground Test Page"
//        driver.findElement(By.partialLinkText("Find By Playground")).click();
//// TODO: Print current URL
//      String url1 =  driver.getCurrentUrl();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        System.out.println("current URL = " + url1);
//            assertEquals("https://testpages.eviltester.com/styled/find-by-playground-test.html",url1,"https://testpages.eviltester.com/styled/find-by-playground-test.html");
//// TODO: Navigate back
//                driver.navigate().back();
//// TODO: Print URL after going back
//  String url2 = driver.getCurrentUrl();
//        System.out.println("URL after going back = " + url2);
//// TODO: Click on "WebDriver Example Page"
//   driver.findElement(By.partialLinkText("WebDriver Example Page")).click();
//// TODO: Print current URL
//            String url3 = driver.getCurrentUrl();
//                System.out.println("current URL = " + url3);
//// TODO: Enter value 20 in number input
//  WebElement num = driver.findElement(By.xpath("*//input[@name='number-entry']"));
//        num.sendKeys("20");
//            num.submit();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// TODO: Verify 'two, zero' message appears
//       WebElement text = driver.findElement( By.xpath("//*[@class='message']"));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//       String text2 = text.getText();
//        System.out.println("text2 = " + text2);
////
//       Assertions.assertEquals("two, zero", text2, "Verify");
//        WebElement text = driver.findElement(By.xpath("//*[@class='message']"));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        String text2 = text.getText();
//        System.out.println("text2 = " + text2);
//
//        Assert.assertTrue(message.getText().contains("two, zero"));
//
//        assertEquals("two, zero", text2,"Verify");

//        WebElement message = driver.findElement(By.id("message"));
//        String actualMessage = message.getText();
//        System.out.println("Message displayed: " + actualMessage);
//        assertEquals("two, zero", actualMessage);











//    static WebDriver driver;
//    @BeforeAll
//    public static void setUp() {
//        // TODO: Initialize static WebDriver
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        // TODO: Navigate to ToDo List
//
//    }
//    @AfterAll
//    public static void tearDown() throws InterruptedException {
//        // TODO: Close driver
//        Thread.sleep(3000);
//        driver.quit();
//    }



