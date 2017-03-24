/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumbers;

/**
 *
 * @author Devang
 */
public class RomanNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NumeroRomano a1 = new NumeroRomano("MMDCCCLXXXVIII");
        NumeroRomano b2 = new NumeroRomano("MMDCCCLXXXVIII");
        System.out.println(Math.suma(a1, b2));
        System.out.println(Math.suma(a1, b2));
        
    }
    
}
