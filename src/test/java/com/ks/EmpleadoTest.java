package com.ks;

import com.ks.recursosHumanos.Empleado;
import junit.framework.TestCase;
import org.junit.Assert;

public class EmpleadoTest extends TestCase {

    public void testGeneraDNI() {
        Empleado GenerandoDNI = new Empleado();

        GenerandoDNI.GeneraDNI();
        Assert.assertEquals(10,GenerandoDNI.getDni().length());
    }
}