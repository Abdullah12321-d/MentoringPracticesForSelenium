package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C16_Alertr02 {
    @Test
            void task1() {
        //Go to URL: http://demo.automationtesting.in/Alerts.html
        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
        //Click "Alert with OK" and click 'click the button to display an alert box:’
        clickAlertOption(1);

        //Accept Alert(I am an alert box!) and print alert on console.
        //Click "Alert with OK & Cancel" and click 'click the button to display a confirm box’
        //Cancel Alert  (Press a Button !)
        //Click "Alert with Textbox" and click 'click the button to demonstrate the prompt box’
        //And then sendKeys «Bootcamp» (Please enter your name)
        //Finally print on console this message "Hello Bootcamp How are you today" assertion these message.


    }

    private void clickAlertOption(int i) {
//        WebDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));

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
