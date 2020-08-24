package by.htp.basics;

import java.math.BigInteger;
import java.util.Scanner;

public class Loop {
    
    // Напишите программу, где пользователь вводит любое целое положительное число. 
    // А программа суммирует все числа от 1 до введенного пользователем числа.
    public static int task01() {
        
        int sum;
        sum = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter a positive integer");
        int last = scan.nextInt();
        scan.close();   // or suppress warnings above
        
        for (int i = 0; i < last; i++) {
            sum = sum + i + 1;
        }
        
        return sum;
    }
    
    // Вычислить значения функции на отрезке [а,b] c шагом h
    public static void task02(int x, int a, int b, int h) {
        
        int y;
        
        if (x > 2) {
            
            for (int i = a; i <= b; i = i + h) {
                
                y = i;
                System.out.println("y = " + y);
            }
            
        } else {
            
            for (int i = a; i <= b; i = i + h) {
               
                y = -i;
                System.out.println("y = " + y);
            }
        }
    }
    
    // Найти сумму квадратов первых ста чисел. Допустим, включая нуль
    public static int task03() {
        
        int squared;
        int sum;
        
        sum = 0;
        
        for (int i = 0; i < 100; i++) {
            squared = i * i;
            sum = sum + squared;
        }
        
        return sum;
    }
    
    // Составить программу нахождения произведения квадратов первых двухсот чисел. 
    // Допустим, начиная с 1-цы
    public static void task04() {
        
        int squared;
        BigInteger mult = new BigInteger("1");
        
        
        for (int i = 1; i <= 200; i++) {
           
            squared = i * i;
            mult = mult.multiply(BigInteger.valueOf(squared));
        }
        
        System.out.println("multiplied = " + mult);
        
    }
    
    // Даны числовой ряд и некоторое число е. 
    // Найти сумму тех членов ряда, модуль которых 
    // больше или равен заданному е. Общий член ряда имеет вид: an = 2^(-n) + 3^(-n)
    public static double task05() {
        
        double an;
        double n;
        double nLast;
        double e;
        double sum;
        
        nLast = 4;
        e = 0.5;
        sum = 0;
        
        for (int i = 0; i < nLast; i++) {
            n = i + 1;
            an = Math.pow(2, -n) + Math.pow(3, -n);
            if (Math.abs(an) >= e) {
                sum = sum + an;
            }
        }
        
        return sum;
    }
    
    // Вывести на экран соответствий между символами и их численными обозначениями 
    // в памяти компьютера (Таблицу ASCII).
    public static void task06() {
        
        char sign;
        
        System.out.println("num  | sign");
        
        for (int i = 32; i < 256; i++) {
            sign = (char)i;
            
            if (i < 100) {
                System.out.print(" ");
            }
            
            System.out.println(i + " | " + sign);
        }
    }
    
    // Для каждого натурального числа в промежутке от m до n вывести все делители, 
    // кроме единицы и самого числа. m и n вводятся с клавиатуры.
    public static void task07() {
        
        int m;
        int n;
        
        @SuppressWarnings("resource")
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your m ");
        m = sc.nextInt();
        System.out.println("Enter your n ");
        n = sc.nextInt();
        
        for ( int i = m; i <= n; i++) {
            System.out.print("Делители " + i + " : ");
            for (int j = 2; j <= 9; j++) {
                if ((i % j == 0) && (i != j)) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
    
    // Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
    public static void task08(int a, int b) {
        
        int num1;
        int num2;
        
        while (a > 0) {
            
            num1 = a % 10;
            a = a / 10;
            num2 = b;
            
            while (num2 > 0) {
            
                if(num2 % 10 == num1) {
                
                    System.out.print(num1 + "; ");
                    num2 = num2 / 10;
                    break;
                
                } else {
                
                    num2 = num2 / 10;
                }
            }
        }
    }

}
