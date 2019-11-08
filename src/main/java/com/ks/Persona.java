package com.ks;

import java.util.Random;

import static java.lang.Math.pow;

public class Persona implements MetodosPersona
{
    protected String nombre;
    protected int edad;
    protected String DNI;
    protected char sexo;
    protected float peso;
    protected float altura;
    protected Cuenta CuentaP;

    public Persona()
    {
        this.nombre = "";
        this.edad = 0;
        this.sexo = ' ';
        this.peso = 0;
        this.altura= 0;
        this.CuentaP = new Cuenta();
    }

    public Persona(String nombre, char sexo, int edad, String tarjeta)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
        this.CuentaP = new Cuenta(tarjeta);
    }

    public Persona(String nombre, char sexo, int edad, float peso, float altura, String tarjeta)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.CuentaP = new Cuenta(tarjeta);
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public char getSexo()
    {
        return sexo;
    }

    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }

    public float getPeso()
    {
        return peso;
    }

    public void setPeso(float peso)
    {
        this.peso = peso;
    }

    public float getAltura()
    {
        return altura;
    }

    public void setAltura(float altura)
    {
        this.altura = altura;
    }

    public void setTarjeta(String tarjeta)
    {
        CuentaP.SetTarjeta(tarjeta);
    }

    public void setCantidad(float cantidad)
    {
        CuentaP.SetCantidad(cantidad);
    }

    public float getCantidad()
    {
        return CuentaP.GetCantidad();
    }

    public String getTarjeta()
    {
        return CuentaP.GetTarjeta();
    }

    public int calcularIMC()
    {
        int opc = -2;
        double imc = this.peso / pow(this.altura, 2);
        if (imc < 20)
        {
            opc = -1;
        }
        if (imc >= 20 && imc <= 25)
        {
            opc = 0;
        }
        if (imc > 25)
        {
            opc = 1;
        }
        return opc;
    }

    @Override
    public void GeneraDNI()
    {
        int a1 = (int) Math.random();
        int a2 = (int) Math.random();
        int a3 = (int) Math.random();
        int a4 = (int) Math.random();
        int a5 = (int) Math.random();
        int a6 = (int) Math.random();
        int a7 = (int) Math.random();
        int a8 = (int) Math.random();
        String DNI = "" + a1 + "" + a2 + "" + a3 + "" + a4 + "" + a5 + "" + a6 + "" + a7 + "" + a8;

        String rand = String.valueOf(new Random().nextLong());
        String leftPad = String.format("%80d", 1);
        this.DNI = DNI;
    }

    public boolean esMayorDeEdad()
    {
        if (this.edad >= 18)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void comprobarSexo(char sexo)
    {
        if (this.sexo == sexo)
        {
            this.sexo = 'h';
        }
    }


    @Override
    public String toString(){
        String Datos = "nombre: " + this.nombre + "\n" +
                "edad: " + this.edad + "\n" +
                "DNI: " + this.DNI + "\n" +
                "peso: " + this.peso + "\n" +
                "altura: " + this.altura + "\n" +
                this.CuentaP.toString();

        return Datos;
    }


}
