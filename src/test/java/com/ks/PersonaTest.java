package com.ks;

import com.ks.recursosHumanos.Persona;
import junit.framework.TestCase;
import org.junit.Assert;

public class PersonaTest extends TestCase
{

    public void testCalcularIMC()
    {
        Persona Valormenos20 = new Persona();
        Valormenos20.setPeso(18);
        Valormenos20.setAltura(1);

        Persona Valor20 = new Persona();
        Valor20.setPeso(20);
        Valor20.setAltura(1);

        Persona Valormayor25 = new Persona();
        Valormayor25.setPeso(26);
        Valormayor25.setAltura(1);

        Persona Valormayor20peromenor25 = new Persona();
        Valormayor20peromenor25.setPeso(22);
        Valormayor20peromenor25.setAltura(1);

        Assert.assertEquals(0,Valor20.calcularIMC());
        Assert.assertEquals(1,Valormayor25.calcularIMC());
        Assert.assertEquals(-1,Valormenos20.calcularIMC());
        Assert.assertEquals(0,Valormayor20peromenor25.calcularIMC());
    }

    public void testGeneraDNI()
    {
        Persona generandoDNI = new Persona();

        for (int i = 1; i <= 1000;i++){
            generandoDNI.GeneraDNI();
            System.out.println(generandoDNI.getDni());
            Assert.assertEquals(8,generandoDNI.getDni().length());
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
        Persona Mujer = new Persona();
        Mujer.setSexo('M');
        Mujer.comprobarSexo('M');
        Assert.assertEquals('M',Mujer.getSexo());
        Mujer.comprobarSexo('H');
        Assert.assertEquals('H',Mujer.getSexo());


    }

}