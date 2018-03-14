/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.es.vaimeufilho;

import java.util.HashMap;

/**
 *
 * @author 1998547
 */
public class Calculadora {
    
    private HashMap<String,Integer> mapaNumeros;
    
    public Calculadora(){
        mapaNumeros = new HashMap<String,Integer>();
        mapaNumeros.put("I", 1);
        mapaNumeros.put("V", 5);
        mapaNumeros.put("X", 10);
        mapaNumeros.put("L", 50);
        mapaNumeros.put("C", 100);    
        mapaNumeros.put("D", 500);    
        mapaNumeros.put("M", 1000);    
    }
    
    public int calcular(String numeroRomano){
        
        int tamanho = numeroRomano.length();
        
        int Resultado = 0;
        int numeroAtual = 0;
        int numeroProximo = 0;
       
        
        if(tamanho == 1)
        {
            Resultado = mapaNumeros.get(numeroRomano);
            
            return Resultado;
        }
        
        else
        {
            for (int contador = 0; contador <= tamanho-1; contador ++)
            {

                numeroAtual = mapaNumeros.get(Character.toString(numeroRomano.charAt(contador)));
                
                if (contador < tamanho-1)
                {
                numeroProximo = mapaNumeros.get(Character.toString(numeroRomano.charAt(contador+1)));
                }
                
                else
                {
                numeroProximo = 0;
                }

                if(numeroAtual >= numeroProximo)
                {
                    Resultado += numeroAtual;
                }

                else
                {
                    Resultado -= numeroAtual;
                }

            }    
        
        return Resultado;
      }
    }
}
