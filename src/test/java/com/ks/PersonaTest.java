package com.ks;

import junit.framework.TestCase;
import org.junit.Assert;

public class PersonaTest extends TestCase
{

    public void testCalcularIMC()
    {

    }

    public void testGeneraDNI()
    {
        Persona GenerandoDNI = new Persona();

        GenerandoDNI.GeneraDNI();
        Assert.assertEquals(8,GenerandoDNI.getDNI().length());
    }

    public void testEsMayorDeEdad()
    {
        System.out.println(" ------------ INICIANDO EL TEST DE testEsMayorDeEdad() en la clase " + this.getClass().getName());

        Persona menorDeEdad = new Persona();
        menorDeEdad.setEdad(15);

        Persona mayorDeEdad = new Persona();
        mayorDeEdad.setEdad(18);

        Persona adultoMayor = new Persona();
        adultoMayor.setEdad(80);

        Assert.assertFalse(menorDeEdad.esMayorDeEdad());
        Assert.assertTrue(mayorDeEdad.esMayorDeEdad());
        Assert.assertTrue(adultoMayor.esMayorDeEdad());
    }

    public void testComprobarSexo()
    {
    }

    public void testToString1()
    {
    }
}