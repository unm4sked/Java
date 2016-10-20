/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liczby_doskonale;

/**
 *
 * @author Łukasz
 */
public class doskonala {
    public boolean liczba(int n){
        int s = 1; 
        double p =(int) Math.sqrt(n);
        for(int i=2;i<=p;i++){
            
            if (n%i == 0) 
                s+=i+n/i;
            if(n==p*p) 
                s-=p;
            if(n == s)
                return true;
            
        }
        return false;
    }
}
