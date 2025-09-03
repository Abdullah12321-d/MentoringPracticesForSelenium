package tests;

import org.junit.jupiter.api.*;

public class C06_JUnit {
    @BeforeAll
    static void beforeall(){
        System.out.println("beforeAll");

    }

    @AfterAll
    static void afterall(){

        System.out.println("afterAll");
    }
    @AfterEach
     void afterEach() {

        System.out.println("afterEach");

    }
        @BeforeEach
     void beforeEach() {

            System.out.println("beforeEach");

        }

    @Test
    void test01(){
        System.out.println("true01");


    }

    @Test
    void test02(){
        System.out.println("true02");


    }  @Test
    void test03(){
        System.out.println("true03");


    }  @Test
    void test04(){
        System.out.println("true04");


    }
}
