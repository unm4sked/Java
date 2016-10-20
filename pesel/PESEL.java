package pesel;

import java.util.Scanner;

public class PESEL {

    public static void main(String[] args) {
        System.out.println("Podaj PESEL (11 cyfr):");

        Scanner sc = new Scanner(System.in);
        String pesel = sc.next();
        String s = Character.toString(pesel.charAt(2))+Character.toString(pesel.charAt(3));
       System.out.println("Rok urodzin: 19"+pesel.charAt(0)+pesel.charAt(1));
       
       switch (s) {
           case "01":
               System.out.println("Miesiac urodzin: Styczeń ");
               break;
           case "02":
               System.out.println("Miesiac urodzin: Luty ");
               break;   
           case "03":
               System.out.println("Miesiac urodzin: Marzec ");
               break;
           case "04":
               System.out.println("Miesiac urodzin: Kwiecien ");
               break;   
           case "05":
               System.out.println("Miesiac urodzin: Maj ");
               break;
           case "06":
               System.out.println("Miesiac urodzin: Czerwiec ");
               break;   
           case "07":
               System.out.println("Miesiac urodzin: Lipiec ");
               break;
           case "08":
               System.out.println("Miesiac urodzin: Sierpien ");
               break; 
           case "09":
               System.out.println("Miesiac urodzin: Wrzesien ");
               break; 
           case "10":
               System.out.println("Miesiac urodzin: Październik ");
               break; 
           case "11":
               System.out.println("Miesiac urodzin: Listopad ");
               break; 
           case "12":
               System.out.println("Miesiac urodzin: Grudzien ");
               break; 
               
               
       }
       System.out.println("Dzien urodzin: "+pesel.charAt(4)+pesel.charAt(5));
    }

}
