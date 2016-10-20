
package liczby_doskonale;

import java.lang.*;
import java.util.Scanner;
/**
 *
 * @author Łukasz
 */
public class Liczby_doskonale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int a = sc.nextInt();
        doskonala d = new doskonala();
        if(d.liczba(a))
            System.out.println("Liczba "+a+" jest doskonala");
        else System.out.println("Liczba "+a+" nie jest doskonala");
    
}
