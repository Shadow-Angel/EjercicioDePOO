package com.ks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona Pers = new Empleado();
        Pers.GeneraDNI();
        System.out.println("Bienvenido, teclea el nombre");
        Pers.setNombre(leer.next());
        System.out.println("teclea la edad");
        Pers.setEdad(leer.nextInt());
        System.out.println("teclea el sexo");
        Pers.setSexo(leer.next().charAt(0));
        System.out.println("teclea el peso");
        Pers.setPeso(leer.nextFloat());
        System.out.println("Teclea el numero de tarjeta");
        Pers.setTarjeta(leer.next());
        System.out.println("Teclea la cantidad ");
        Pers.setCantidad(leer.nextFloat());
        System.out.println("Teclea la altura");
        Pers.setAltura(leer.nextFloat());
        if(Pers.esMayorDeEdad() == true){
            System.out.println("es mayor de edad");
        }else{
            System.out.println("No es mayor de edad");
        }
        System.out.println(Pers.toString());
        Pers.GenTexto();

    }
}
