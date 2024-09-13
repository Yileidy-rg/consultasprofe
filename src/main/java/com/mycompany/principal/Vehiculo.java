/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author yilei
 */
public class Vehiculo {
    private String marca, modelo, tipo_combustible;
    private int anio_fab;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }

    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }

    public int getAnio_fab() {
        return anio_fab;
    }

    public void setAnio_fab(int anio_fab) {
        this.anio_fab = anio_fab;
    }

  
    @Override
    public String toString() {
        return "marca=" + marca + ", modelo=" + modelo + ", tipo_combustible=" + tipo_combustible + ", anio_fab=" + anio_fab + '}';
    }

    
   

    public void metodo(){
        Vehiculo v = new Vehiculo();
        if (anio_fab>=2020) {
            System.out.println("tu vehiculo es \n" + v.toString() );
            System.out.println("y es un vehiculo moderno");   
        }else if (anio_fab>2000 && anio_fab<2019) {
           System.out.println("tu vehiculo es \n" + v.toString() );
           System.out.println("y es un vehiculo reciente");    
        }else if (anio_fab>1980 && anio_fab<1999){
            System.out.println("tu vehiculo es \n" + v.toString() );
            System.out.println("y es un vehiculo clasico");   
        }else{
        System.out.println("tu vehiculo es \n" + v.toString() );
        System.out.println("y es un vehiculo antiguo");   
    }
}
    
    
        
        
    
}

    

