package com.ks;

import java.util.Random;

public class Empleado extends Persona implements MetodosPersona{
    private int NoEmpleado;
    private String puesto;

    public Empleado(){
        this.puesto = "N" +
                "" +
                "inguno";
        this.NoEmpleado = 0;
    }

    @Override
    public void GeneraDNI()
    {
        String DNI = String.valueOf(new Random().nextLong());
        if(DNI.length() > 8){
            DNI = DNI.substring(0,10);
        }
        this.DNI = DNI;
        /*
        //this.DNI.format("%020d",1);
        String leftPad = String.format("%80d", 1);
        */
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
    public String toString(){
        String Datos = "nombre: " + this.nombre + "\n" +
                "edad: " + this.edad + "\n" +
                "DNI: " + this.getDNI() + "\n" +
                "peso: " + this.peso + "\n" +
                "altura: " + this.altura + "\n" +
                this.CuentaP.toString() + "\n" +
                "Puesto: " + this.puesto + "\n" +
                "No. Empleado: " + this.NoEmpleado;
        return Datos;
    }

}
