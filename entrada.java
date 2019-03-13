
package pruebaGit;

import javax.swing.JOptionPane;



public class entrada {
    
      double base;
    int expo;
    
     public static void main (String [] Args){
        
    entrada hola=new entrada();
        
        hola.sumaPotencias();
    
} 
    
    
    
    
    
    public void sumaPotencias(){
        
        try{
        Procesamiento obj=new Procesamiento();
        double acumulador=0;
        base=Double.parseDouble(JOptionPane.showInputDialog("ingrese la base (numero decimal) "));
            expo=Integer.parseInt(JOptionPane.showInputDialog(" ingrese el exponente (numero entero)"));
        for(int i=0; i<4; i++){
            
            
            if(i==0){
                acumulador=obj.Elevador(base, expo);
                
            }else if(i!=0){
                acumulador=obj.Elevador(acumulador, expo);
            }
        }
    JOptionPane.showMessageDialog(null, "el resultado es: "+Math.round(acumulador));
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "escribio un numero incorrecto");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "error");
    }
        
    }       
        
    
}
