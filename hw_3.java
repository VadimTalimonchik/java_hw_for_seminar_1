// Задача 3.
// Реализовать простой калькулятор

import java.util.Scanner;

public class hw_3 {
   public static void main(String[] args) {
       Scanner iScanner = new Scanner(System.in);
       Scanner oScanner = new Scanner(System.in);
       System.out.print("\nВведите первое число: ");
       double x = iScanner.nextDouble();
       System.out.print("Введите второе число: ");
       double y = iScanner.nextDouble();
       System.out.print("Введите оперцию (+, -, *, /): ");
       String operate = oScanner.nextLine();
       iScanner.close();
       oScanner.close();
       boolean corect = true;
       double res = 0;
       switch(operate){
           case "+":
           res = x + y;
           break;
           case "-":
           res = x - y;
           break;
           case "*":
           res = x * y;
           break;
           case "/":
           if(y != 0) res = x / y;
           else {
               System.out.println("\nНа ноль делить нельзя");
               corect = false;
           }
           break;
       default: 
           System.out.println("\nТакой операции нет");
           break;
       }
       if (corect) {
           System.out.printf("\n%.2f %s %.2f = %.2f\n", x, operate, y, res);
       }

   }
   
}
