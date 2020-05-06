package com.project.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class MainTest {
    Main obj = new Main();

    @BeforeEach
    public void func1() {
        System.out.println("Before");
    }

    @AfterEach
    public void func2() {
        System.out.println("After");
    }

    @BeforeAll
    public static void func3() {
        System.out.println("Before All");
    }

    @AfterAll
    static public void func4() {
        System.out.println("After All");
    }

    @Test
    public void sum3nos() {
        int sum = obj.sum(new int[]{1, 2, 3});
        if (sum != 6)
            fail("Failure occurred");
    }

    @Test
    public void sum1no() {
        assertEquals(1, obj.sum(new int[]{1}));
        /*
            assertTrue()
            assertFalse()
            assertNull()
            assertNotNull()
            assertArrayEquals()
         */
    }
}