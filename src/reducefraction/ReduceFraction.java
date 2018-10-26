/*
 * Ferris D.
 * 26/10/2018
 * reduces input fraction to lowest possible
 */

package reducefraction;

/**
 *
 * @author fedie2562
 */
public class ReduceFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        
    }
    public static int gcd(int n){
        if(n == 1){
            return 1;
        }else{
            return gcd(n);
        }
    }
}
