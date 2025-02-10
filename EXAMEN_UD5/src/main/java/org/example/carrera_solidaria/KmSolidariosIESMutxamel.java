package org.example.carrera_solidaria;

public class KmSolidariosIESMutxamel {
    public static void main(String[] args){
        Organizador iesmutxamel = new Organizador("I");
        System.out.println(iesmutxamel);
        Corredor corredor1 = new Corredor("Luis",1.5);
        System.out.println(corredor1);

        iesmutxamel.inscribirCorredor(corredor1);
        corredor1.insertarPatrocinador("Madre"/*,"Profe_mates","Profe_ingles"*/);
        corredor1.insertarPatrocinador("Profe_cast");
        System.out.println(corredor1);
        Corredor corredor2 = new Corredor("Carla",0.0);
        System.out.println(corredor2);
        iesmutxamel.inscribirCorredor(corredor2);
        System.out.println(iesmutxamel);
        //a)
        iesmutxamel.mostrarCorredores();
        //b)
        corredor1.setVueltas_completas(15);
        iesmutxamel.calcularDonacion(corredor1);

    }
}
