/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern02observer;

import java.util.Random;

/**
 *
 * @author stefan
 * original code see
 * http://www.vincehuston.org/dp/ObserverDemosJava
 * accessed on 2016-02-20
 */
public class Pattern02observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Subject sub = new Subject();
        // 7. Client configures the number and type of Observers
        new HexObserver(sub);
        new OctObserver(sub);
        new BinObserver(sub);
        
        for (int i = 0 ; i < 100 ; i++)
        {
            Random r = new Random();
            sub.setState(Math.abs(r.nextInt())) ;  // positive numbers only
            System.out.println("\n----------------------------------------------");
            System.out.println("  getState -> " + sub.getState() ) ;
            System.out.println("\n----------------------------------------------");            
        }
        
       
//        while (true) {
//            System.out.print("\nEnter a number: ");
//            sub.setState(Read.anInt());
//        }
    }

}
