package com.ks;

import com.ks.recursosHumanos.Empleado;
import junit.framework.TestCase;
import org.junit.Assert;

public class EmpleadoTest extends TestCase {

    public void testGeneraDNI() {

        System.out.println(" ------------ INICIANDO EL TEST DE testGeneraDNI() en la clase " + this.getClass().getName());
        for (int i = 1; i <= 1000;i++){
            Empleado generandoDNI = new Empleado();
            // System.out.println(generandoDNI.getDni());
            Assert.assertEquals(10,generandoDNI.getDni().length());
            Assert.assertTrue(Long.parseLong(generandoDNI.getDni()) > 0);
        }
    }
}