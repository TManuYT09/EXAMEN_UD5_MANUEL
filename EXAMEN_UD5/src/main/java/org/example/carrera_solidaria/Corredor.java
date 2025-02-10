package org.example.carrera_solidaria;

import java.util.ArrayList;

public class Corredor {
    private static int numDorsal=0; //Para controlar el numero del dorsal del corredor

    private String nombre;
    private int dorsal;
    private ArrayList<String> listaPatrocinadores;
    private double importe_vuelta;
    private int vueltas_completas;

    public Corredor(String nombre, double importe_vuelta){
        this.nombre=nombre; //Introduce el nombre del corredor
        dorsal=anyadirDorsal(); //Asigna el numero del dorsal de forma automatica
        listaPatrocinadores=new ArrayList<>(); //Crea la lista
        if (importe_vuelta==0){//Comprueba la cantidad el importe
            this.importe_vuelta=0.50; //Si es 0, coloca un valor por defecto
        }else {
            this.importe_vuelta=importe_vuelta; //Si no lo es, coloca el importe establecido
        }
        vueltas_completas=0;//Las vueltas son cero por defecto
    }

    public int anyadirDorsal(){
        return ++numDorsal; //Asigna el dorsal sumandole 1 a la variable y se lo asigna al dorsal
    }

    public void insertarPatrocinador(String nombre){
        System.out.println("* Nuevos patrocinadores añadidos para el corredor "+getNombre());
        listaPatrocinadores.add(nombre); //Añade a un nuevo patrocinador a la lista
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public ArrayList<String> getListaPatrocinadores() {
        return listaPatrocinadores;
    }

    public void setListaPatrocinadores(ArrayList<String> listaPatrocinadores) {
        this.listaPatrocinadores = listaPatrocinadores;
    }

    public double getImporte_vuelta() {
        return importe_vuelta;
    }

    public void setImporte_vuelta(double importe_vuelta) {
        this.importe_vuelta = importe_vuelta;
    }

    public int getVueltas_completas() {
        return vueltas_completas;
    }

    public void setVueltas_completas(int vueltas_completas) {
        this.vueltas_completas = vueltas_completas;
    }

    @Override
    public String toString() {
        return "- Corredor{" +
                "nombre='" + nombre + '\'' +
                ", dorsal=" + dorsal +
                ", listaPatrocinadores=" + listaPatrocinadores +
                ", importe_vuelta=" + importe_vuelta +
                ", vueltas_completas=" + vueltas_completas +
                '}';
    }
}
