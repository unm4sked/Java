import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Wybierz numer zadania domowego #1:\n(1-7)");
        Scanner sc = new Scanner(System.in);
        int odp = sc.nextInt();
        switch (odp){
            case 1:
                System.out.println("Zadanie nr. 1: \n");
                String odp1 = "    #1  Jaka jest różnica między while a do-while?\n" +
                        " \n" +
                        "            While może nie wykonać się ani razu jeśli warunek nie przejdzie, a do-while\n" +
                        "            wykona się zawsze minimum raz ,bo najpierw są wykonywane instrukcje, a\n" +
                        "            dopiero później sprawdzany warunek.\n" +
                        " \n" +
                        "    #2  W jaki sposób pobrać wartość logiczną?\n" +
                        " \n" +
                        "            Rzutując zmienną na boolean.\n" +
                        "       \n" +
                        "    #3  Czym jest i do czego służy println()?\n" +
                        "       \n" +
                        "            Jest to standardowy strumień wyjścia, jest to metoda klasy PrintStream.";
                System.out.println(odp1);
                break;
            case 2:
                System.out.println("Zadanie nr. 2: \n");
                System.out.print("Int:");
                int i = sc.nextInt();
                System.out.print("Byte:");
                byte b = sc.nextByte();
                System.out.print("Short:");
                short s = sc.nextShort();
                System.out.print("Long:");
                long l = sc.nextLong();
                System.out.print("Float:");
                float f = sc.nextFloat();
                System.out.print("Double:");
                double d = sc.nextDouble();
                System.out.print("Boolean:");
                boolean bool = sc.nextBoolean();
                System.out.print("Char:");
                char ch = sc.next().charAt(0);

                System.out.println(i + " " + b + " " + s + " " + l + " " + f + " " + d + " " + bool + " "+ ch);

                break;
            case 3:
                System.out.println("Zadanie nr. 3: \n");

                System.out.println("Podaj imie");
                String fname = sc.next();
                System.out.println("Podaj nazwisko");
                String lname = sc.next();
                System.out.println("Podaj wiek");
                String age = sc.next();

                System.out.println("Twoje dane: \n"+"Wiek: "+age+"\nImie: "+fname+"\nNazwisko: "+lname);
                break;
            case 4:
                System.out.println("Zadanie nr. 4: \n");
                for(int licznik=-1000; licznik<=1001;licznik+=3){
                    System.out.print(licznik+" ");
                }
                break;

            case 5:
                System.out.println("Zadanie nr. 5: \n");
                System.out.println("Podaj 3 liczby");
                double x1 = sc.nextDouble();
                double x2 = sc.nextDouble();
                double x3 = sc.nextDouble();
                double max;
                if(x1>x2) max = x1;
                else max = x2;
                if(x3>max) System.out.println(x3);
                else System.out.println(max);

                break;

            case 6:
                System.out.println("Zadanie nr. 6: \n");
                System.out.println("Podaj 2 liczby:");

                boolean gra = true;
                while(gra) {
                    System.out.println("Podaj 2 liczby:");
                    double y1 = sc.nextDouble();
                    double y2 = sc.nextDouble();
                    System.out.println("Podaj operację(* / + -):");
                    char y3 = sc.next().charAt(0);
                    switch (y3) {
                        case '*':
                            System.out.println(y1 + "*" + y2 + "=" + y1 * y2);
                            break;
                        case '/':
                            if (y2 != 0) System.out.println(y1 + "/" + y2 + "=" + y1 / y2);
                            else System.out.println("Nie mozna dzielic przez 0!");
                            break;
                        case '+':
                            System.out.println(y1 + "+" + y2 + "=" + (y1 + y2));
                            break;
                        case '-':
                            System.out.println(y1 + "-" + y2 + "=" + (y1 - y2));
                            break;
                        default:
                            System.out.println("??????");
                            break;

                    }
                    System.out.print("Nasicnik q jesli chcesz wyjść, jeśli nie to wciśnij byle co");
                    char zmienna = sc.next().charAt(0);
                    if(zmienna == 'q') gra = false;
                }
                break;
            case 7:
                System.out.println("Zadanie nr. 7: \n");
                System.out.println("Podaj 2 liczby: \nNWD");
                int z1 = sc.nextInt();
                int z2 = sc.nextInt();
                while(z1!=z2){
                    if(z1>z2) z1-=z2;
                    else z2-=z1;
                }
                System.out.println(z1);
                break;
            default:
                System.out.println("Zadania są tylko o numerze 1-7");
        }
    }
}
