package week2_Tasks;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class task1W2Tud {

    /*
    Go to https://testpages.eviltester.com/styled/calculator
    Type any number in first and second input
    Click Calculate for each operation
    Get and verify results for all operations
     */

    @Test
            void Calc() throws InterruptedException {
        driver.get("https://testpages.eviltester.com/styled/calculator");
       WebElement number1 = driver.findElement(By.id("number1"));
        WebElement number2 = driver.findElement(By.id("number2"));
        Select select = new Select(driver.findElement(By.tagName("select")));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        number1.clear();
        number1.sendKeys("3");
        number2.clear();
        number2.sendKeys("4");
//        List<WebElement> operation = driver.findElements(By.tagName("select"));



        select.selectByValue("plus");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("calculate"))).click();
       Assertions.assertEquals("7",driver.findElement(By.id("answer")).getText(),"the result is true");
       System.out.println("Answer = " + driver.findElement(By.id("answer")).getText());



     wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//select[@id='function']//option[@value='times']")))).click();
        driver.findElement(By.id("calculate")).click();
        Assertions.assertEquals("12",driver.findElement(By.id("answer")).getText(),"the result is not true");
        System.out.println("Answer = " + driver.findElement(By.id("answer")).getText());


        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//select[@id='function']//option[@value='minus']")))).click();
        driver.findElement(By.id("calculate")).click();
        Assertions.assertEquals("-1",driver.findElement(By.id("answer")).getText(),"the result is not true");
        System.out.println("Answer = " + driver.findElement(By.id("answer")).getText());



        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//select[@id='function']//option[@value='divide']")))).click();
        driver.findElement(By.id("calculate")).click();
        Assertions.assertEquals("0.75",driver.findElement(By.id("answer")).getText(),"the result is not true");
        System.out.println("Answer = " + driver.findElement(By.id("answer")).getText());








    }












    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

}
