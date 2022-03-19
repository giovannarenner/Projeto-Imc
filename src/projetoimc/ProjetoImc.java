/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoimc;
import java.util.Scanner;




public class ProjetoImc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        double peso;
        double altura;
        
        Scanner leia = new Scanner (System.in);
        System.out.println("Informe o seu peso");
        peso = leia.nextDouble();
        System.out.println("Informe a sua altura");
        altura = leia.nextDouble();
        
        double imc;
        imc = peso / (altura*altura);
        
        if(imc<18.5){
            System.out.println("Você está abaixo do peso!");
            
        }else if(imc>=18.6 && imc <=24.9){
            System.out.println("Você está no peso normal!");
            
        }else if (imc>=25 && imc <=29.9){
            System.out.println("Você está acima do peso!");
            
        }else if (imc>=30 && imc <=34.9){
            System.out.println("Você está acima do peso, Obesidade 1!");
        
    }else if (imc>=35 && imc <=39.9){
            System.out.println("Você está acima do peso, Obesidade 2!");
    
}else{
        System.out.println("Obesidade grau 3!");
    }
    }
}
    
