/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem5;

import java.util.Scanner;

/**
 *
 * @author Lopez Avila
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Problem5 p5 = new Problem5();
        int number_tests, number;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de test a realizar: ");
        number_tests = sc.nextInt();
        
        for (int i = 1; i <= number_tests; i++) {
            System.out.println("Ingrese el número " + i + ": ");
            number = sc.nextInt();
            
            System.out.println(p5.prime(number));
        } 
    }
    
    /*
    * Función encargada de validar si el número es primo o no
    */
    public String prime(int number){
        String result;
        int i = 2;
        //Recorremos mientras el número sea diferente de 1 y el residuo del numero sea diferente de 0
        while(number != 1 && number % i != 0 ){
            i++;
        }

        if (number == i) {
            result = "PRIME";
        }else {
            result = "NOT PRIME";
        }
        return result;
    }
}
