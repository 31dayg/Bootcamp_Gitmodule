package com.qamindslab.conferencia1;

import java.util.*;

public class ControlDeEntrada extends Persona {
    Scanner sc = new Scanner(System.in);
    Persona persona = new Persona();

    Queue<String> filaAsistentes = new LinkedList<>();
    Queue<String> edades = new LinkedList<>();
    Queue<String> telefonos = new LinkedList<>();
    Queue<String> correos = new LinkedList<>();
    Queue<String> domicilios = new LinkedList<>();

    Map<Integer, String> nombre = new HashMap<>();
    Map<Integer, String> edad = new HashMap<>();
    Map<Integer, String> telefono = new HashMap<>();
    Map<Integer, String> correo = new HashMap<>();
    Map<Integer, String> domicilio = new HashMap<>();

    /*public void constantes() {

        filaAsistentes.add("Diego");
        filaAsistentes.add("Dayana");
        filaAsistentes.add("Ulises");
        filaAsistentes.add("Alan");
        filaAsistentes.add("Juan");
        filaAsistentes.add("Pedro");
        filaAsistentes.add("Roberto");
        filaAsistentes.add("Blanca");
        filaAsistentes.add("Adriana");
        filaAsistentes.add("Lucrecia");
        filaAsistentes.add("Susana");
        filaAsistentes.add("Amador");
        filaAsistentes.add("Alex");
        filaAsistentes.add("Lucas");
        filaAsistentes.add("Ramon");
        filaAsistentes.add("Pancho");
        filaAsistentes.add("Tomas");
        filaAsistentes.add("Eduardo");
        filaAsistentes.add("Simon");
        filaAsistentes.add("Lucas");

        edades.add("60");
        edades.add("24");
        edades.add("18");
        edades.add("25");
        edades.add("22");
        edades.add("25");
        edades.add("26");
        edades.add("18");
        edades.add("25");
        edades.add("23");
        edades.add("15");
        edades.add("28");
        edades.add("32");
        edades.add("33");
        edades.add("22");
        edades.add("15");
        edades.add("28");
        edades.add("32");
        edades.add("33");
        edades.add("22");

            // Datos de los asistentes.
        nombre.put(1,"Diego");
        edad.put(1,"60");
        telefono.put(1,"8122572");
        correo.put(1,"dauiwud@gmail.com");
        domicilio.put(1,"dkaw #43 keaa");

        nombre.put(2,"Dayana");
        edad.put(2,"20");
        telefono.put(2,"81514772");
        correo.put(2,"false@gmail.com");
        domicilio.put(2,"kcancwhk #221 keaa");

        nombre.put(3,"Ulises");
        edad.put(3,"18");
        telefono.put(3,"81514772");
        correo.put(3,"false@gmail.com");
        domicilio.put(3,"kcancwhk #221 keaa");

        nombre.put(4,"Alan");
        edad.put(4,"25");
        telefono.put(4,"81514772");
        correo.put(4,"false@gmail.com");
        domicilio.put(4,"kcancwhk #221 keaa");

        nombre.put(5,"Juan");
        edad.put(5,"18");
        telefono.put(5,"81514772");
        correo.put(5,"false@gmail.com");
        domicilio.put(5,"kcancwhk #221 keaa");

        nombre.put(6,"Pedro");
        edad.put(6,"60");
        telefono.put(6,"8122572");
        correo.put(6,"dauiwud@gmail.com");
        domicilio.put(6,"dkaw #43 keaa");

        nombre.put(7,"Roberto");
        edad.put(7,"21");
        telefono.put(7,"81514772");
        correo.put(7,"false@gmail.com");
        domicilio.put(7,"kcancwhk #221 keaa");

        nombre.put(8,"Blanca");
        edad.put(8,"18");
        telefono.put(8,"81514772");
        correo.put(8,"false@gmail.com");
        domicilio.put(8,"kcancwhk #221 keaa");

        nombre.put(9,"Adriana");
        edad.put(9,"25");
        telefono.put(9,"81514772");
        correo.put(9,"false@gmail.com");
        domicilio.put(9,"kcancwhk #221 keaa");

        nombre.put(10,"Lucrecia");
        edad.put(10,"21");
        telefono.put(10,"81514772");
        correo.put(10,"false@gmail.com");
        domicilio.put(10,"kcancwhk #221 keaa");

        nombre.put(11,"Susana");
        edad.put(11,"60");
        telefono.put(11,"8122572");
        correo.put(11,"dauiwud@gmail.com");
        domicilio.put(11,"dkaw #43 keaa");

        nombre.put(12,"Amador");
        edad.put(12,"24");
        telefono.put(12,"81514772");
        correo.put(12,"false@gmail.com");
        domicilio.put(12,"kcancwhk #221 keaa");

        nombre.put(13,"Alex");
        edad.put(13,"16");
        telefono.put(13,"81514772");
        correo.put(13,"false@gmail.com");
        domicilio.put(13,"kcancwhk #221 keaa");

        nombre.put(14,"Lucas");
        edad.put(14,"25");
        telefono.put(14,"81514772");
        correo.put(14,"false@gmail.com");
        domicilio.put(14,"kcancwhk #221 keaa");

        nombre.put(15,"Ramon");
        edad.put(15,"28");
        telefono.put(15,"81514772");
        correo.put(15,"false@gmail.com");
        domicilio.put(15,"kcancwhk #221 keaa");

        nombre.put(16,"Julian");
        edad.put(16,"23");
        telefono.put(16,"81514772");
        correo.put(16,"false@gmail.com");
        domicilio.put(16,"kcancwhk #221 keaa");

        nombre.put(17,"Daniel");
        edad.put(17,"33");
        telefono.put(17,"81514772");
        correo.put(17,"false@gmail.com");
        domicilio.put(17,"kcancwhk #221 keaa");

        nombre.put(18,"Panchito");
        edad.put(18,"29");
        telefono.put(18,"81514772");
        correo.put(18,"false@gmail.com");
        domicilio.put(18,"kcancwhk #221 keaa");

        nombre.put(19,"Oscar");
        edad.put(19,"27");
        telefono.put(19,"81514772");
        correo.put(19,"false@gmail.com");
        domicilio.put(19,"kcancwhk #221 keaa");

        nombre.put(20,"Lucas");
        edad.put(20,"18");
        telefono.put(20,"81514772");
        correo.put(20,"false@gmail.com");
        domicilio.put(20,"kcancwhk #221 keaa");

        }*/


    public void setFilaAsistentes(Queue<String> filaAsistentes) {
        persona.setNombre(sc.nextLine());
        //sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        filaAsistentes.add(persona.getNombre());
    }
    public void setEdades(Queue<String> edades) {
        persona.setEdad(sc.nextLine());
        //sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        edades.add(persona.getEdad());
    }
    public void setTelefonos(Queue<String> telefonos) {
        persona.setTelefono(sc.nextLine());
        //sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        telefonos.add(persona.getTelefono());
    }
    public void setCorreos(Queue<String> correos) {
        persona.setCorreo(sc.nextLine());
        //sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        correos.add(persona.getCorreo());
    }
    public void setDomicilios(Queue<String> domicilios) {
        persona.setDomicilio(sc.nextLine());
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        domicilios.add(persona.getDomicilio());
    }

}

