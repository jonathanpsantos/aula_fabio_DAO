
package Model;

import javax.swing.JOptionPane;


public class Tela_DAO {
    public static void Solicitaoperacao(){
       
        String x = JOptionPane.showInputDialog(null,"Escolha a Operação \n1 -Soma\n2 -Subtração \n3 - Multiplicação \n4 -Divisão");
        int op = Integer.parseInt(x);
        
        /*String x2 = x.toUpperCase();
                     //LowerCase minusculo
                     
        if (x.equals("A")) || x.equals("a"))*/ 
        if (op == 1) {
        Model.Classex_DAO.soma();
        }
        else if (op == 2){
        Model.Classex_DAO.sub();
        }    
        
        else if (op == 3){
        Model.Classex_DAO.mult();
        }
        else if (op == 4){
        Model.Classex_DAO.div();
        }
        else{
            JOptionPane.showInputDialog(null,"Opção Invalida");
        }
    
}
    
}