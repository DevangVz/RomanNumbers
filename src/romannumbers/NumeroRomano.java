/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumbers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Devang
 */
public class NumeroRomano {

    int value;
    String numeroRomano;

    NumeroRomano(String numero) {
        System.out.println(isValid(numero));
        parseInt(numero);
        System.out.println(value);
    }

    public void parseInt(String num) {
        List<Integer> roman = new ArrayList<Integer>();
        boolean lessThan = false;
        for (int i = 0, j = 1; i < num.length(); i++, j++) {
            switch (num.charAt(i)) {
                case 'M':
                    roman.add(1000);
                    break;
                case 'C':
                    if (j < num.length()) {
                        switch (num.charAt(j)) {
                            case 'M':
                                roman.add(900);
                                i++;j++;
                                break;
                            case 'D':
                                roman.add(400);
                                i++;j++;
                                break;
                            default:
                                roman.add(100);
                        }
                    }else{roman.add(100);}
                    break;
                case 'L':
                    roman.add(50);
                    break;
                case 'D':
                    roman.add(500);
                    break;
                case 'V':
                    roman.add(5);
                    break;    
                case 'X':
                    if (j < num.length()) {
                        switch (num.charAt(j)) {
                            case 'C':
                                roman.add(90);
                                i++; j++;
                                break;
                            case 'L':
                                roman.add(40);
                                i++; j++;
                                break;
                            default:
                                roman.add(10);
                        }
                        
                    }else{roman.add(10);}
                    break;
                case 'I':
                    if (j < num.length()) {
                        switch (num.charAt(j)) {
                            case 'X':
                                roman.add(9);
                                i++;j++;
                                break;
                            case 'V':
                                roman.add(4);
                                i++;j++;
                                break;
                            default:
                                roman.add(1);break;
                        }}else{roman.add(1);}
                        
                    break;

            }
        }
        int b=0;
        for(int a=0; a<roman.size();a++){
         value+=roman.get(a);
        }
        
    }
   
    
    

    
    public boolean isValid(String numero) {
        return numero.matches("M{0,2}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})");
    }
    
    
}
