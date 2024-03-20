/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.anhpd.gcd.test.core;

import com.anhpd.gcd.core.GCD;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class GCDTest {
    @Test
    public void testFindGCD() {
        System.out.println("findGCD");
        int a = 0;
        int b = 1;
        int expResult = 1;
        int result = GCD.findGCD(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindGCD1() {
        System.out.println("findGCD");
        int a = 0;
        int b = 5;
        int expResult = 5;
        int result = GCD.findGCD(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindGCD2() {
        System.out.println("findGCD");
        int a = 5;
        int b = 0;
        int expResult = 5;
        int result = GCD.findGCD(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindGCD3() {
        System.out.println("findGCD");
        int a = 5;
        int b = 5;
        int expResult = 5;
        int result = GCD.findGCD(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindGCD4() {
        System.out.println("findGCD");
        int a = 5;
        int b = 3;
        int expResult = 5;
        int result = GCD.findGCD(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindGCD5() {
        System.out.println("findGCD");
        int a = 2;
        int b = -2;
        int expResult = 2;
        int result = GCD.findGCD(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindGCD6() {
        System.out.println("findGCD");
        int a = -2;
        int b = 0;
        int expResult = 2;
        int result = GCD.findGCD(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindGCD7() {
        System.out.println("findGCD");
        int a = 0;
        int b = -4;
        int expResult = 40;
        int result = GCD.findGCD(a, b);
        assertEquals(expResult, result);
    }

}
