package com.anhpd.mathutil.core;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class MathUtil {
    public static long getFactorial(int n) {
        
        // n < 0 TH ngoại lệ - > không tính được
        // n > 20 tràn số
        if (n<0 || n>20) {
            throw new IllegalArgumentException("Invalid input. Inpur must be in range between 0-20");
        }
        
        // THDB : Quy ước giai thừa
        if(n==0 || n==1) 
            return 1;
        
        long product = 1;
        for (int i = 2; i <= n; i++) 
            product *= i;//product = product * i;
        
        return product;
    }
}
