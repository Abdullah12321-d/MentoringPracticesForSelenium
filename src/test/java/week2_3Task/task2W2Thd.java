package week2_3Task;

import BaseClassPackage.BaseClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class task2W2Thd extends BaseClass {


    /*
    Go to https://claruswaysda.github.io/dragAndDrop.html
    Drag the items in their right places
    Assert the success message
*/

        @Test
        void task1()  {
//            Go to https://claruswaysda.github.io/dragAndDrop.html
            driver.get("https://claruswaysda.github.io/dragAndDrop.html");
//            Drag the items in their right places
            actions.dragAndDrop(driver.findElement(By.id("piece1")), driver.findElement(By.id("slot1"))).perform();
            actions.dragAndDrop(driver.findElement(By.id("piece2")), driver.findElement(By.id("slot2"))).perform();
            actions.dragAndDrop(driver.findElement(By.id("piece3")), driver.findElement(By.id("slot3"))).perform();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("celebrate")));
            String message = driver.findElement(By.id("celebrate")).getText();
            Assertions.assertTrue(message.contains("Congratulations!"));

        }
}
