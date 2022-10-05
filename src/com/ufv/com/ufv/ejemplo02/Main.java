package com.ufv.com.ufv.ejemplo02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        p.setNombre(sc.nextLine());
        System.out.println("Escribe tus apellidos: ");
        p.setApellidos(sc.nextLine());
        System.out.println("Escribe tu DNI sin letra: ");
        p.setDnisinletra(sc.nextInt());
        System.out.println("Escribe tu Edad: ");
        p.setEdad(sc.nextInt());

        System.out.println("Buenos días " + p.getNombre() " " + p.getApellidos() + " con DNI " + p.getDnisinletra() + "con edad " +p.getEdad());



    }
}

