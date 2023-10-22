/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author SetLopez1999
 */
public class WAFLERA implements ELECTRODOMESTICOS{
    
    public String tipo;
    String marca;
    String modelo;

    public WAFLERA(String marca, String modelo,String tipo ) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

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

    
    
    
    @Override
    public String nombre() {
        return "Wafflera";
    }

    
    @Override
    public String NombreDelRegistro() {
        String texto = nombre() + "                       ";
        texto = texto.substring(0,12)+ " | " + marca;
        return texto;
    }

    @Override
    public void Clasificable() {
        
    }
    
    
}
