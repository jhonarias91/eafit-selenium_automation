package com.jhonarias91;

import org.junit.jupiter.api.*;

public class UnitTest {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before all");
    }

    @BeforeEach
    public void beforeEach(){
        //Ejemplo levantar el driver
        System.out.println("Before each");
    }

    @Test
    public void testSuma(){
        //Arange
        int a= 1;
        int b = 2;

        //Act
        int result = a + b;

        //Assert
        Assertions.assertEquals(3, result);
    }

    @Test
    public void rest(){
        Calculator calculator = new Calculator();
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After all");
    }

    @AfterEach
    public void afterEach(){
        //Ejemplo cerrar el driver
        System.out.println("After each");
    }

}
