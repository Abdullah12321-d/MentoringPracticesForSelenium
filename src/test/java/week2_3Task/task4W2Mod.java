package week2_3Task;
import java.time.Duration;
import java.util.List;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import static org.junit.jupiter.api.Assertions.assertFalse;

public class task4W2Mod {

    @Test
    public void testTodoListFunctionality() {
        /*
        : Go to "http://webdriveruniversity.com/To-Do-List/index.html" and create a test that:
        Uses Faker to generate 5 random task names
        Adds all tasks to the todo list
        Marks every other task as completed (strikethrough)
        Deletes all completed tasks
        Verifies only incomplete tasks remain
         */
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Faker faker = new Faker();
//        Go to "http://webdriveruniversity.com/To-Do-List/index.html" and create a test that:
        driver.get("http://webdriveruniversity.com/To-Do-List/index.html");

//


        // Uses Faker to generate 5 random task names
        WebElement inBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
        for (int i = 0; i < 5; i++) {
            String task = faker.book().title();
            inBox.sendKeys(task);
            inBox.sendKeys(Keys.ENTER);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(text(),'" + task + "')]")));
        }
        // Marks every other task as completed (strikethrough)
        List<WebElement> tasks = driver.findElements(By.xpath("//i[@class='fa fa-trash']"));
        for (int i = 0; i < tasks.size(); i++) {

                tasks.get(i).click();

        }

        List<WebElement> reman = driver.findElements(By.xpath("//i[@class='fa fa-trash']"));
        for (WebElement task : reman) {
            boolean isCompleted = task.getAttribute("class").contains("completed");
            assertFalse(isCompleted, "Task should not be marked as completed");
        }

        driver.quit();
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
