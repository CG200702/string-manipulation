/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulation;

/**
 *
 * @author CG200702
 */
import java.text.DecimalFormat;
import java.math.BigDecimal;
public class Stringmanipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myText = "Programming is amazing! No Seriously.";
        System.out.println(myText.length());
        System.out.println(myText.charAt(0));
        System.out.println(myText.substring(0, 7));
        System.out.println(myText.replace("ing is", "ers are"));
        
        int a = 'A';
        System.out.println(a);
        
        char b = 66;
        System.out.println(b);
        
        //Rouding
        double myDouble = 3.14159265359;
        double myDub =  Math.PI;
        
        //Rounding:Method one - Number of 0s is the decimal places
        System.out.println((double)Math.round(myDouble*100000)/100000);
        
        //method 2
        System.out.println(Math.round(myDouble));
        
        //method 3
        DecimalFormat df = new DecimalFormat("0.0000000");
        System.out.println(df.format(myDouble));
        System.out.println(Math.pow(2,8));
        
        //Truncation
        BigDecimal bd = new BigDecimal(myDouble);
        bd = bd.setScale(2,BigDecimal.ROUND_DOWN);
        System.out.println(bd.doubleValue());

    }

}
