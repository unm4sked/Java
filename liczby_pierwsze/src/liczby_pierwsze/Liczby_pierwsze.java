
package liczby_pierwsze;


import java.lang.*;
import java.util.Scanner;
/**
 *
 * @author Łukasz
 */
public class Liczby_pierwsze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Podaj przedzial x1<x2");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        czy_pierwsza c = new czy_pierwsza();
        for(; x1<=x2;x1++){
            if (c.licz(x1)==true) {
                System.out.println(x1);
            }
        }
    }
    
}
