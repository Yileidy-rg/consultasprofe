/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

import java.util.Scanner;

/**
 *
 * @author yilei
 */
public class Principal {

    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();
       Scanner entrada = new Scanner(System.in);
        String marca, modelo, tipo_combustible;
        int año_fab;
        
        System.out.println("Digite la marca de su vehiculo");
        marca=entrada.next();
        System.out.println("Digite el modelo de su vehiculo");
        modelo=entrada.next();
        System.out.println("Digite el tipo de combustible");
        tipo_combustible=entrada.next();
        System.out.println("Digite el año de su vehiculo");
        año_fab=entrada.nextInt();
        entrada.nextLine();
        
        //para guardar
        v.setMarca(marca);
        v.setModelo(modelo);
        v.setTipo_combustible(tipo_combustible);
        v.setAnio_fab(año_fab);
       
        //para traer al metodo
        v.metodo();
       
        
        
        
    }
}
