package week2_3Task;

import BaseClassPackage.BaseClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class task1w2Thd extends BaseClass {

     /*
Go to https://claruswaysda.github.io/Draw.html
Draw a triangle
Reset
*/

    @Test
    void task1() throws InterruptedException {
        driver.get("https://claruswaysda.github.io/Draw.html");
        WebElement myCanvas = driver.findElement(By.id("myCanvas"));
        actions.moveToElement(myCanvas, 100, 100).clickAndHold().moveByOffset(-100, -200).perform();
        actions.moveByOffset(-100, 200).perform();
        actions.moveByOffset(200, -0).release().perform();


        WebElement resetButton = driver.findElement(By.id("resetButton"));
        actions.click(resetButton).perform();





    }


}
