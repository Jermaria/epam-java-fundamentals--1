package by.htp.basics;

public class Linear {

    public static void main(String[] args) {
        

    }
    
    //Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
    public static double task01(double a, double b, double c) {
        
        double z;
        
        z = ((a - 3) * b / 2) + c;
        
        return z;
    }
    
    // Вычислить значение выражения по формуле
    public static double task02(double a, double b, double c) {
        
        double temp;
        
        temp =  b + Math.sqrt(b * b + 4 * a * c);
        temp = temp / 2 / a;
        temp = temp - Math.pow(a, 3) * c;
        temp = temp + Math.pow(b, -2);
        
        return temp;
    }
    
    // Вычислить значение выражения по формуле
    public static double task03(double x, double y) {
        
        double temp;
        
        temp = Math.sin(x) + Math.cos(y);
        temp = temp / (Math.cos(x) - Math.sin(y));
        temp = temp * Math.tan(x * y);
        
        return temp;
    }
    
    // Дано действительное число R вида nnn.ddd 
    // (три цифровых разряда в дробной и целой частях). 
    // Поменять местами дробную и целую части числа и вывести полученное значение числа.
    public static double task04(double r1) {
        
        double r2;
        double integer, fractional;
        
        integer = r1 * 1000 % 1000;
        fractional = (int)r1 / 1000.0;
        r2 = integer + fractional;
        
        return r2;
    }
    
    // Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
    // Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
    // ННч ММмин SSc.  
    public static void task05(int t) {
        
        int hour, min, sec;
        
        hour = t / 3600;
        min = t / 60 % 60;
        sec = t - min*60 - hour*3600;

        if (hour < 10) {
            System.out.print("0" + hour + "ч ");
        } else {
            System.out.print(hour + "ч ");
        }
        
        if (min < 10) {
            System.out.print("0" + min + "мин ");
        } else {
            System.out.print(min + "мин ");
        }
        
        if (sec < 10) {
            System.out.print("0" + sec + "с ");
        } else {
            System.out.print(sec + "с ");
        }
    }
    
    //Для данных областей составить линейную программу, 
    // которая печатает true, если точка с координатами (х, у)
    // принадлежит закрашенной области, и false — в противном случае
    public static void task06(double x, double y) {
        
        if ((Math.abs(x) <= 2) && (y >= 0) && (y <= 4) 
                || (Math.abs(x) <= 4) && (y >= -3) && (y <= 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
