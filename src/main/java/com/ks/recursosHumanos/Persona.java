package com.ks.recursosHumanos;

import com.ks.RecursosBancarios.Cuenta;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Persona
{
    protected String nombre;
    protected int edad;
    protected String dni;
    protected char sexo;
    protected float peso;
    protected float altura;
    protected Cuenta cuentaP;

    public Persona()
    {
        this.nombre = "";
        this.edad = 0;
        this.sexo = ' ';
        this.peso = 0;
        this.altura= 0;
        this.cuentaP = new Cuenta();
    }

    public Persona(String nombre, char sexo, int edad, String tarjeta)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
        this.cuentaP = new Cuenta(tarjeta);
    }

    public Persona(String nombre, char sexo, int edad, float peso, float altura, String tarjeta)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.cuentaP = new Cuenta(tarjeta);
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
        cuentaP.setTarjeta(tarjeta);
    }

    public void setCantidad(float cantidad)
    {
        cuentaP.setCantidad(cantidad);
    }

    public float getCantidad()
    {
        return cuentaP.getCantidad();
    }

    public String getTarjeta()
    {
        return cuentaP.getTarjeta();
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

    public void GeneraDNI()
    {
        String dni = String.valueOf(abs(new Random().nextLong()));
        if(dni.length() >= 8){
            dni = dni.substring(0,8);
        }
        this.dni = dni;
        /*
        String leftPad = String.format("%80d", 1);
        */
    }

    public boolean esMayorDeEdad()
    {
        return this.edad >= 18;
    }

    public void comprobarSexo(char sexo)
    {
        if (this.sexo != sexo)
        {
            this.sexo = 'H';
        }
    }



    public String toString(){
        String Datos = "nombre: " + this.nombre + "\n" +
                "edad: " + this.edad + "\n" +
                "DNI: " + this.getDni() + "\n" +
                "peso: " + this.peso + "\n" +
                "altura: " + this.altura + "\n" +
                this.cuentaP.toString();

        return Datos;
    }


    public void genTexto(){
        this.fileWriter(this.toString());
    }

    public void fileWriter(String datos){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("C://Users//Pc//Desktop//Datos.txt");
            pw = new PrintWriter(fichero);

            pw.println(datos);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
