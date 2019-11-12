package com.ks.recursosHumanos;

import java.util.Random;

import static java.lang.Math.abs;

public class Empleado extends Persona {
    private int noEmpleado;
    private String puesto;

    public Empleado(){
        this.puesto = "Ninguno";
        this.noEmpleado = 0;
        this.dni = generaDNI();
    }

    @Override
    public  String generaDNI()
    {
        String  dni = String.format("%010d",abs(new Random().nextLong()));
        if(dni.length() >= 10){
            dni = dni.substring(0,10);
        }
        return dni;
    }
    public int getNoEmpleado() {
        return noEmpleado;
    }

    public void setNoEmpleado(int noEmpleado) {
        this.noEmpleado = noEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public void genTexto(){
        this.fileWriter(this.toString());
    }
    @Override
    public String toString(){
        String datos = "nombre: " + this.nombre + "\n" +
                "edad: " + this.edad + "\n" +
                "DNI: " + this.getDni() + "\n" +
                "peso: " + this.peso + "\n" +
                "altura: " + this.altura + "\n" +
                this.cuentaP.toString() + "\n" +
                "Puesto: " + this.puesto + "\n" +
                "No. Empleado: " + this.noEmpleado;
        return datos;
    }

}
