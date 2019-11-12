package com.ks.recursosHumanos;

import java.util.Random;

public class Empleado extends Persona {
    private int NoEmpleado;
    private String puesto;

    public Empleado(){
        this.puesto = "Ninguno";
        this.NoEmpleado = 0;
    }

    @Override
    public void GeneraDNI()
    {
        String DNI = String.valueOf(new Random().nextLong());
        this.dni = String.format("%.10d",DNI);
    }
    public int getNoEmpleado() {
        return NoEmpleado;
    }

    public void setNoEmpleado(int noEmpleado) {
        NoEmpleado = noEmpleado;
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
        String Datos = "nombre: " + this.nombre + "\n" +
                "edad: " + this.edad + "\n" +
                "DNI: " + this.getDni() + "\n" +
                "peso: " + this.peso + "\n" +
                "altura: " + this.altura + "\n" +
                this.cuentaP.toString() + "\n" +
                "Puesto: " + this.puesto + "\n" +
                "No. Empleado: " + this.NoEmpleado;
        return Datos;
    }

}
