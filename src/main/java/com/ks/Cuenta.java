package com.ks;


public class Cuenta {
    private String tarjeta;
    private float cantidad;

    public  Cuenta(){
        this.cantidad = 0;
        this.tarjeta ="";
    }

    public Cuenta(String tarjeta,float cantidad){
        if(tarjeta.length() == 15 || tarjeta.length() == 16){
            this.tarjeta = tarjeta;
        }
        this.cantidad = cantidad;
    }
    public Cuenta(String tarjeta){
        if(tarjeta.length() == 15 || tarjeta.length() == 16){
            this.tarjeta = tarjeta;
        }else{
            System.out.println("El numero de tarjeta debe tener 15 o 16 caracteres");
            this.tarjeta = "Comprobar!";
        }
    }


    public void SetTarjeta(String tarjeta){
        this.tarjeta = tarjeta;
    }

    public void SetCantidad(float cantidad){
        this.cantidad = cantidad;
    }

    public String GetTarjeta(){
        return this.tarjeta;
    }

    public float GetCantidad(){
        return this.cantidad;
    }

    public String toString(){
        String Datos = "Tarjeta: " + this.tarjeta + "\n" +
                "Cantidad: " + this.cantidad;
        return Datos;
    }

    public void ingresar(double cantidad){
        if(cantidad > 0){
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad){
        if (this.cantidad - cantidad < 0){
            this.cantidad = 0;
        }else{
            this.cantidad -= cantidad;
        }

    }

}
