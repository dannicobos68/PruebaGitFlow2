package com.ufv.com.ufv.ejemplo02;

public class Persona {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDnisinletra() {
        return dnisinletra;
    }

    public void setDnisinletra(int dnisinletra) {
        this.dnisinletra = dnisinletra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad <= 18){
            System.out.println("Estas hecho un chaval");
        }
        else {
            System.out.println("ok Boomer");
        }
        this.edad=edad;

    }

    private String nombre;
    private String apellidos;
    private int dnisinletra;
    private int edad;


}
