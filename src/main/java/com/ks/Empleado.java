package com.ks;

public class Empleado extends Persona implements MetodosPersona{
    private int NoEmpleado;
    private String puesto;

    public Empleado(){

    }

    @Override
    public String GeneraDNI(){
        int a1 = (int) Math.random();
        int a2 = (int) Math.random();
        int a3 = (int) Math.random();
        int a4 = (int) Math.random();
        int a5 = (int) Math.random();
        int a6 = (int) Math.random();
        int a7 = (int) Math.random();
        int a8 = (int) Math.random();
        int a9 = (int) Math.random();
        int a10 = (int) Math.random();
        String DNI = "" + a1 + "" + a2 + "" + a3 + "" + a4 + "" + a5 + "" + a6 + "" + a7 + "" + a8 + "" + a9 + "" + a10;
        return DNI;
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

}
