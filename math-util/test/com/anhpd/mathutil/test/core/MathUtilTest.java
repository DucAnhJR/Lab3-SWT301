/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.anhpd.mathutil.test.core;

import com.anhpd.mathutil.core.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class MathUtilTest {
    
    @Test
    public void getFactorialGivenRightAgrumentReturnWell() {
        long expected = 1; //expected result
        int n = 5; // input test case
        long actual = MathUtil.getFactorial(n); 
        
        //So sánh actual với expected -> Giống nhau = xanh , Khác nhau = Đỏ
        assertEquals(expected, actual);
    }
    
    /**
     * Test of factorial method, of class MathUtils.
     */
    @Test
    public void testFactorial1() {
        int n = 21;
        long expResult = 1;
        if (n == 0 || n == 1) {
            expResult = 1;
        }
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                expResult *= i;
            }
        }
        long result = MathUtil.getFactorial(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testFactorial2() {
        int n = -5;
        long expResult = 1;
        if (n == 0 || n == 1) {
            expResult = 1;
        }
        if (n < 0) {
//            assertThrows(IllegalArgumentException.class, () -> MathUtils.factorial(n));
            throw new IllegalArgumentException("Input must be non-negative");
        }
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                expResult *= i;
            }
        }
        long result = MathUtil.getFactorial(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testFactorial3() {
        int n = 0;
        long expResult = 1;
        if (n == 0 || n == 1) {
            expResult = 1;
        }
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                expResult *= i;
            }
        }
        long result = MathUtil.getFactorial(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testFactorial4() {
        int n = 1;
        long expResult = 1;
        if (n == 0 || n == 1) {
            expResult = 1;
        }
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                expResult *= i;
            }
        }
        long result = MathUtil.getFactorial(n);
        assertEquals(expResult, result);
    }
    
}
