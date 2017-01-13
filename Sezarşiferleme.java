package sezarşiferleme;

import java.util.Scanner;

/**
 *
 * @author mustafa
 */

public class Sezarşiferleme {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("şifreleme yapmak istediğiniz metni giriniz");
        System.out.println("şifreleme yapmak istemiyorsanız 0 giriniz");
        String s = sc.nextLine();

        if (s != "0") {
            System.out.println("kaç birim ötelensin?(0 ile 25 arasında bir deger)");
            int oteleme_mik = sc.nextInt();

            String ifade;
            ifade = sc.nextLine();

            char[] cumle = s.toCharArray();
            for (int j = 0; j < cumle.length; j++) {
                for (int k = 0; k < oteleme_mik; k++) {
                    cumle[j]++;
                }
                //if(cumle[j]>122){
                //cumle[j]=(cumle[j]-122)+'a';

                //}
            }
            for (int j = 0; j < cumle.length; j++) {
                System.out.print(cumle[j]);
            }

        }

    }
}
