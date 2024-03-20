/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anhpd.mathutil.main;

import com.anhpd.mathutil.core.MathUtil;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        long expected = 120; //expected result
        int n = 5; // input test case
        long actual = MathUtil.getFactorial(n);
        
        System.out.println("5! = 120 expected");
        System.out.println("5! = "+actual+" actual");
    }
}
