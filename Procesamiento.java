/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioprogra2;

/**
 *
 * @author hernandez
 */
public class Procesamiento {
   


    public double Elevador(double n, int m){
        double base=n;
        int expo=m;
        int contador=1;
        double acumulador=base;
        while(contador<expo){
            acumulador=base*acumulador;
            contador++;
        }
        
        return acumulador;
        
        
    
    }}