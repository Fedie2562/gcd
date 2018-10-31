/*
 * Ferris D.
 * 26/10/2018
 * reduces input fraction to lowest possible
 */

package reducefraction;

import javax.swing.JOptionPane;

/**
 *
 * @author fedie2562
 */
public class ReduceFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Input
        int numerator = Integer.parseInt(JOptionPane.showInputDialog("Enter the numerator"));
        int denominator = Integer.parseInt(JOptionPane.showInputDialog("Enter the denominator"));
        // Output
        System.out.println("The fraction "+numerator+"/"+denominator+" can be reduced to "
                +numerator/gcd(numerator,denominator)+"/"+denominator/gcd(numerator,denominator));
    }
    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b, a%b);
        }
    }
}
