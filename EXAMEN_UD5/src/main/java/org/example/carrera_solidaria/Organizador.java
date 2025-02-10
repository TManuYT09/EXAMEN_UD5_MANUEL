package org.example.carrera_solidaria;

import java.util.ArrayList;

public class Organizador {
    private String nombre;
    private String edicion;
    private ArrayList<Corredor> listaCorredores;

    public Organizador(String edicion) {
        this.nombre = "IES MUTXAMEL"; //Coloco a nombre IES MUTXAMEL
        if (edicion.contains("I")){ //Compruebo que lo que se a introducido es un I
            this.edicion = edicion; //Si lo es, lo introduce
        }else {
            this.edicion = "I"; //Si no lo es, introduce por defecto un I
        }
        listaCorredores=new ArrayList<>();
    }

    public void inscribirCorredor(Corredor corredor){
        if (listaCorredores.size()<=700){ //Comprueba el tamaño de la lista
            System.out.println("* Nueva inscripción realizada. Corredor : "+corredor.getNombre()+" con dorsal "+corredor.getDorsal()); //Si cabe, lo mete
            listaCorredores.add(corredor);
        }else {
            System.out.println("* No se pueden añadir mas corredores, estamos completos"); //Si no cabe, no lo mete y muestra un mensaje de error
        }
    }

    public void mostrarCorredores(){
        System.out.println("Corredores inscritos: "+listaCorredores.size()); //Muestra la cantidad de corredores mediante el tamaño de la lista
        for (Corredor corredor:listaCorredores){
            System.out.println("\t["+corredor.getDorsal()+"]. "+corredor.getNombre());//Muestra al corredor con su dorsal
        }
    }

    public void calcularDonacion(Corredor corredor){
        System.out.println("El corredor "+corredor.getNombre()+" ha conseguido una donación de "+(corredor.getVueltas_completas()*corredor.getImporte_vuelta())+"€"); //Calcula el importe multiplicando el importe por el numero de vueltas
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public ArrayList<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public void setListaCorredores(ArrayList<Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;
    }

    @Override
    public String toString() {
        return "- Organizador{" +
                "nombre='" + nombre + '\'' +
                ", edicion='" + edicion + '\'' +
                ", listaCorredores=" + listaCorredores +
                '}';
    }
}
