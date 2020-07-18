package com.qamindslab.conferencia1;
import java.util.*;

public class PersonaRegistrada extends ControlDeEntrada{
    Map<Integer, Integer> ID = new HashMap<>();

    public void registroNombre(Queue<String> filaAsistentes) {
        for(int i = 0; filaAsistentes.size() > 0; i++) {
            nombre.put(i, filaAsistentes.peek());
            filaAsistentes.poll();
        }
    }

    public void registroID(Queue<String> filaAsistentes) {
        for(int i = 0; i < filaAsistentes.size(); i++){
            ID.put(i, i+1);
        }
    }

    public void registroEdades(Queue<String> edades) {
        for(int i = 0; edades.size() > 0; i++) {
            edad.put(i, edades.peek());
            edades.poll();
        }
    }
    public void registroTelefonos(Queue<String> telefonos) {
        for(int i = 0; telefonos.size() > 0; i++) {
            telefono.put(i, telefonos.peek());
            telefonos.poll();
        }
    }

    public void registroCorreos(Queue<String> correos) {
        for(int i = 0; correos.size() > 0; i++) {
            correo.put(i, correos.peek());
            correos.poll();
        }
    }
    public void registroDomicilio(Queue<String> domicilios) {
        for(int i = 0; domicilios.size() > 0; i++) {
            domicilio.put(i, domicilios.peek());
            domicilios.poll();
        }
    }
}
