package com.qamindslab.conferencia1;

import java.util.*;

public class App {
    public static void main(String[] args) {
        PersonaRegistrada registro = new PersonaRegistrada();
        ControlDeEntrada entrada = new ControlDeEntrada();
        ControlConferencia premios = new ControlConferencia();
        Scanner sc = new Scanner(System.in);
        //entrada.constantes();

        System.out.println("Numero de asistentes: ");
        int totalasis = sc.nextInt();
        for(int i = 0; i < totalasis; i++) {

            System.out.println("Nombre " + (i+1) + ": ");
            entrada.setFilaAsistentes(entrada.filaAsistentes);
            System.out.println("Edad: ");
            registro.setEdades(entrada.edades);
            System.out.println("Telefono: ");
            entrada.setTelefonos(entrada.telefonos);
            System.out.println("Correo: ");
            registro.setCorreos(entrada.correos);
            System.out.println("Domicilio: ");
            registro.setDomicilios(entrada.domicilios);
        }

        //System.out.println(entrada.filaAsistentes);
        registro.registroID(entrada.filaAsistentes);
        //System.out.println("ID values: " + registro.ID);
        registro.registroNombre(entrada.filaAsistentes);
        registro.registroEdades(entrada.edades);
        registro.registroTelefonos(entrada.telefonos);
        registro.registroCorreos(entrada.correos);
        registro.registroDomicilio(entrada.domicilios);

        /*System.out.println(registro.nombre);
        System.out.println(registro.edad);
        System.out.println(registro.telefono);
        System.out.println(registro.correo);
        System.out.println(registro.domicilio);*/


        premios.mult5(registro.nombre, registro.ID, premios.ganadores1);
        premios.menoresDe25(registro.nombre, registro.edad, premios.ganadores2);
        premios.ganadoresFinales(premios.ganadores1, premios.ganadores2, premios.ganadoresFinales);
    }
}
