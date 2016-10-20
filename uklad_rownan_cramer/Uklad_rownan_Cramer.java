
package uklad_rownan_cramer;

import java.util.Scanner;


public class Uklad_rownan_Cramer {

    public static void main(String[] args) {
       System.out.println("{a1*x+b1*y=c1}");
       System.out.println("{a2*x+b2*y=c2}");
       Scanner sc = new Scanner(System.in);
       System.out.println("Podaj a1: ");
       double a1 = sc.nextDouble();
       System.out.println("Podaj b1: ");
       double b1 = sc.nextDouble();
       System.out.println("Podaj c1: ");
       double c1 = sc.nextDouble();
       System.out.println("Podaj a2: ");
       double a2 = sc.nextDouble();
       System.out.println("Podaj b2: ");
       double b2 = sc.nextDouble();
       System.out.println("Podaj c2: ");
       double c2 = sc.nextDouble();
       
        double w = a1*b2 - b1*a2;
        double wx = c1*b2 - b1*c2;
        double wy = a1*c2 - c1*a2;
        
        if(w!=0) 
         {  
             System.out.println("Wynik: ");
             System.out.println("x = "+wx/w);
             System.out.println("x = "+wy/w);
         } 
        else if(wx==0&&wy==0)
            System.out.println("Uklad ma nieskonczenie wiele rozwiazan.");
            else
            System.out.println("Uklad sprzeczny.");
    }
    
}
