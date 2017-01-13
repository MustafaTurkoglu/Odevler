/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivefonk;

/**
 *
 * @author mustafa
 */
public class Recursivefonk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println(faktoriyel(5));
    }

    public static int faktoriyel(int sayı) {
        if (sayı == 0) {
            return 1;
        } else {

            return sayı * faktoriyel(sayı - 1);
        }
    }
}
