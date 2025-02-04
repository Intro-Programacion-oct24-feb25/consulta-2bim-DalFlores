/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo.jav;

/**
 *
 * @author dalto
 */
public class Ejemplo_java {

    public static void cuentaRegresiva(int n) {
        
        if (n < 0) {
            System.out.println("¡Despegue!");
            return;
        }
      
        System.out.println(n);
        
        cuentaRegresiva(n - 1);
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Iniciando cuenta regresiva desde " + numero + ":");
        cuentaRegresiva(numero);
    }
}
