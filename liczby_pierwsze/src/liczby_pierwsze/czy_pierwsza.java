
package liczby_pierwsze;

/**
 *
 * @author Łukasz
 */
public class czy_pierwsza {
    public boolean licz(int x){
        int licznik = 0;
        for(int i=1;i<=x;i++){
            
            if(x%i == 0){
                licznik++;
            }
        }
        if(licznik>2)
            return false;
        else return true;
    }
}
