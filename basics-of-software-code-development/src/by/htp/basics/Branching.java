package by.htp.basics;

public class Branching {
    
    // Даны 2 угла треугольника. Определить, существует ли он.
    // Если да, является ли он прямоугольным?
    public static void task01(int a, int b) {
        
        if ( (a + b) < 180) {
            
            System.out.println("Треугольник существует");
            
            if (a == 90 || b == 90 || (a + b) == 90) {
                
                System.out.println("Он прямоугольный");
            
            } else {
                
                System.out.println("Он не является прямоугольным");
            }
        
        } else {
            
            System.out.println("Треугольника не существует");
        }
    }
    
    // найти max{min(a, b), min(c, d)}
    public static int task02 (int a, int b, int c, int d) {
        
        int min1, min2;
        int max;
        
        if (a < b) {
            min1 = a;
        } else {
            min1 = b;
        }
        
        if (c < d) {
            min2 = c;
        } else {
            min2 = d;
        }
        
        if (min1 > min2) {
            max = min1;
        } else {
            max = min2;
        }
        
        return max;
    }
    
    // Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
    // Определить, будут ли они расположены на одной прямой.
    public static void task03(double x1, double x2, double x3, double y1, double y2, double y3) {
        
        double b, k;
        
        k = (y2 - y1) / (x2 - x1);
        b = y1 - k * x1;
        
        if (y3 == k * x3 + b) {
            
            System.out.println("на одной");
        
        } else {
        
            System.out.println("не на одной");
        }
    }
    
    // Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
    // Определить, пройдет ли кирпич через отверстие
    public static void task04(int a, int b, int x, int y, int z) {
        
        if ((a >= x) && (b >= y) || (a >= y) && (b >= x)
                || (a >= x) && (b >= z) || (a >= z) && (b >= x)
                || (a >= y) && (b >= z) || (a >= z) && (b >= y)) {
                
            System.out.println("пройдёт");
        
        } else {
            
            System.out.println("не пройдёт");
        }
    }
    
    // вычислить значение функции
    public static double task05(double x) {
        
        double y;
        
        if (x <= 3) {
           
            y = x * x - x * x + 9;
        
        } else {
        
            y = 1 / (Math.pow(x, 3) - 6);
        }
        
        return y;
    }

}
