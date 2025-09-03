package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class C07aSSERTIONS {

    @Test
    void assertEqualsTest() {
        String actualData = "abdullah";
        String expecteData = "abdullah";
        Assertions.assertEquals(expecteData, actualData, "name did not match!");

    }


    @Test
    void assertTrueTest() {
        String table = """
                First name: Abdullah
                last name: Batarfi
                Date of Birth: 2000-05-15"
                """;
        Assertions.assertTrue(table.contains("Batarfi"), "Table does not contain Batarfi!");


    } @Test
    void assertFalseTest() {
        String table = """
                First name: Abdullah
                last name: Batarfi
                Date of Birth: 2000-05-15"
                """;
        Assertions.assertFalse(table.contains("ali"), "Table does contain Batarfi!");


    }


    @Test
    void assertNulltest(){
      String  name = "a";
        assertNull(name,"name is not Null");
    }
}