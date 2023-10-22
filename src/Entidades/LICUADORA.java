/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author SetLopez1999
 */
public class LICUADORA implements ELECTRODOMESTICOS{

    int voltaje;
    int velocidad;
    String marca;
    String modelo;

    public LICUADORA(String marca, String modelo,int voltaje) {
        this.voltaje = voltaje;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getVoltaje() {
        return voltaje;
    }
    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
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
        return "Licuadora";
    }

    @Override
    public String NombreDelRegistro() {
        String texto = nombre() + "                       ";
        texto = texto.substring(0,12)+ " | " + marca;
        return texto;    }

    @Override
    public void Clasificable() {
        
    }
    
    
}
