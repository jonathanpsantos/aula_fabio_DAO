/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author manager
 */
public class Classex_DAO {
    
    public static double valor1 = 0 ;
     public static double valor2 = 0 ;
      public static double res = 0 ;
       public static String x = "" ;
    
    
    public static void soma (){
        String x = JOptionPane.showInputDialog(null,"Digete o valor 1");
        double valor1 = Double.parseDouble(x);
         x = JOptionPane.showInputDialog(null,"Digete o valor 2");
        double valor2 = Double.parseDouble(x);
        
        JOptionPane.showInputDialog(null,"O resultado é"+ (valor1+valor2));
        
    }public static void sub (){
        String x = JOptionPane.showInputDialog(null,"Digete o valor 1");
        double valor1 = Double.parseDouble(x);
         x = JOptionPane.showInputDialog(null,"Digete o valor 2");
        double valor2 = Double.parseDouble(x);
        
        JOptionPane.showInputDialog(null,"O resultado é"+ (valor1-valor2));
        
    }
    public static void mult (){
        String x = JOptionPane.showInputDialog(null,"Digete o valor 1");
        double valor1 = Double.parseDouble(x);
         x = JOptionPane.showInputDialog(null,"Digete o valor 2");
        double valor2 = Double.parseDouble(x);
        
        JOptionPane.showInputDialog(null,"O resultado é"+ (valor1*valor2));
        
    }
    public static void div (){
        String x = JOptionPane.showInputDialog(null,"Digete o valor 1");
        double valor1 = Double.parseDouble(x);
         x = JOptionPane.showInputDialog(null,"Digete o valor 2");
        double valor2 = Double.parseDouble(x);
        res = (valor1/valor2);
        JOptionPane.showInputDialog(null,"O resultado é"+ res);
        
    }
}
