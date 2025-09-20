package week3_Tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import utilities.BaseClass;

import java.util.Set;

public class task1W3Sud extends BaseClass {
    /*
Go to https://claruswaysda.github.io/CookiesWait.html
Accept the alert if it is present
Print the cookies
Delete all cookies and assert
*/


    @Test
            void task1()

    {
//        Go to https://claruswaysda.github.io/CookiesWait.html
        driver.get("https://claruswaysda.github.io/CookiesWait.html");

//    Accept the alert if it is present
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException ignored) {

        }
//        driver.findElement(By.id("acceptCookiesButton"));
//    Print the cookies
            Set<Cookie> cookies = driver.manage().getCookies();
            System.out.println("cookies = " + cookies);
//    Delete all cookies and assert

            driver.manage().deleteAllCookies();
            Set<Cookie> cookie = driver.manage().getCookies();
            Assertions.assertEquals(0, cookie.size(), "there are cookies");
        }
    }



//






