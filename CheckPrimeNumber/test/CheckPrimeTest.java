/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.anhpd.checkprime.core.CheckPrime;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class CheckPrimeTest {
    
    @Test
    public void testIsPrime1() {
        System.out.println("isPrime");
        int num = 0;
        boolean expResult = false;
        boolean result = CheckPrime.isPrime(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsPrime2() {
        System.out.println("isPrime");
        int num = 1;
        boolean expResult = false;
        boolean result = CheckPrime.isPrime(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsPrime3() {
        System.out.println("isPrime");
        int num = 3;
        boolean expResult = true;
        boolean result = CheckPrime.isPrime(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsPrime4() {
        System.out.println("isPrime");
        int num = 4;
        boolean expResult = false;
        boolean result = CheckPrime.isPrime(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsPrime5() {
        System.out.println("isPrime");
        int num = -3;
        boolean expResult = false;
        boolean result = CheckPrime.isPrime(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsPrime6() {
        System.out.println("isPrime");
        int num = -7;
        boolean expResult = true;
        boolean result = CheckPrime.isPrime(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsPrime7() {
        System.out.println("isPrime");
        int num = 10;
        boolean expResult = false;
        boolean result = CheckPrime.isPrime(num);
        assertEquals(expResult, result);
    }
}
