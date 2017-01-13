/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantık;

/**
 *
 * @author mustafa
 */
public class Mantık {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        System.out.println("x||y(ikisinde biri true olmalı)" + (x || y));
        System.out.println("x&&y(ikisi de true olmalı)" + (x && y));
        System.out.println("x^y(ikisi farklı olmalı)" + (x ^ y));
    }

}
