package com.ks;

import com.ks.recursosHumanos.Persona;
import junit.framework.TestCase;
import org.junit.Assert;

public class PersonaTest extends TestCase
{

    public void testCalcularIMC()
    {
        Persona valorMenor20 = new Persona();
        valorMenor20.setPeso(18);
        valorMenor20.setAltura(1);

        Persona valor20 = new Persona();
        valor20.setPeso(20);
        valor20.setAltura(1);

        Persona valorMayor25 = new Persona();
        valorMayor25.setPeso(26);
        valorMayor25.setAltura(1);

        Persona valorMayor20PeroMenor25 = new Persona();
        valorMayor20PeroMenor25.setPeso(22);
        valorMayor20PeroMenor25.setAltura(1);

        Assert.assertEquals(0,valor20.calcularIMC());
        Assert.assertEquals(1,valorMayor25.calcularIMC());
        Assert.assertEquals(-1,valorMenor20.calcularIMC());
        Assert.assertEquals(0,valorMayor20PeroMenor25.calcularIMC());
    }

    public void testGeneraDNI()
    {

        System.out.println(" ------------ INICIANDO EL TEST DE testGeneraDNI() en la clase " + this.getClass().getName());
        for (int i = 1; i <= 1000;i++){
            Persona generandoDNI = new Persona();
            //System.out.println(generandoDNI.getDni());
            Assert.assertEquals(8,generandoDNI.getDni().length());
            Assert.assertTrue(Long.parseLong(generandoDNI.getDni()) > 0);
        }
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
        System.out.println(" ------------ INICIANDO EL TEST DE testComprobarSexo en la clase " + this.getClass().getName());
        Persona mujer = new Persona();
        mujer.setSexo('M');
        mujer.comprobarSexo('M');
        Assert.assertEquals('M',mujer.getSexo());
        mujer.comprobarSexo('H');
        Assert.assertEquals('H',mujer.getSexo());


    }

}