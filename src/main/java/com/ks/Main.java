package com.ks;

import com.ks.recursosHumanos.Empleado;
import com.ks.recursosHumanos.Persona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona pers = new Empleado();
        pers.GeneraDNI();
        System.out.println("Bienvenido, teclea el nombre");
        pers.setNombre(leer.next());
        System.out.println("teclea la edad");
        pers.setEdad(leer.nextInt());
        System.out.println("teclea el sexo");
        pers.setSexo(leer.next().charAt(0));
        System.out.println("teclea el peso");
        pers.setPeso(leer.nextFloat());
        System.out.println("Teclea el numero de tarjeta");
        pers.setTarjeta(leer.next());
        System.out.println("Teclea la cantidad ");
        pers.setCantidad(leer.nextFloat());
        System.out.println("Teclea la altura");
        pers.setAltura(leer.nextFloat());
        if(pers.esMayorDeEdad() == true){
            System.out.println("es mayor de edad");
        }else{
            System.out.println("No es mayor de edad");
        }
        System.out.println(pers.toString());
        pers.genTexto();

    }
}
