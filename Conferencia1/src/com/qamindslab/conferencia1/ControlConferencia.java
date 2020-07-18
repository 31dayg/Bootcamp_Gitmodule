package com.qamindslab.conferencia1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ControlConferencia extends PersonaRegistrada {

    List<String> ganadores1 = new ArrayList<>(); //por multiplos de 5
    List<String> ganadores2 = new ArrayList<>(); // menores de 25
    List<String> ganadoresFinales = new ArrayList<>(); // Los ganadores finales

    public void mult5(Map<Integer, String> nombre, Map<Integer, Integer> ID, List<String> ganadores1) {
        for(Integer id : ID.values()) {
            if(id % 5 == 0) {
                ganadores1.add(nombre.get(id-1));
            }
        }
    }

    public void menoresDe25(Map<Integer, String> nombre, Map<Integer, String> edad,List<String> ganadores2) {
        List<Integer> menores25 = new ArrayList<>();
        List<Integer> menores25id = new ArrayList<>();
        for(String edades : edad.values()) {
            int edadInt = Integer.parseInt(edades);
            if(edadInt < 25) {
                menores25.add(edadInt);
            }
        }
        // Saque los keys de esas edades.
        for(Integer i : menores25) {
            String edadS = String.valueOf(i);
            for (Integer id : edad.keySet()) {
                if(edadS.equals(edad.get(id))){
                    menores25id.add(id);
                }
            }
        }

        // Como las edades se repetian para algunos, tuve que agregar esta parte para borrar los keys repetidos.
        for(int n = 0; n < menores25id.size(); n++) {
            for(int m = n+1; m < menores25id.size(); m++){
                if(menores25id.get(n) == menores25id.get(m)) {
                    menores25id.remove(m);
                }
            }
        }
        // Aqui se guardan los posibles ganadores menores de 25.
        for(Integer id : nombre.keySet()) {
            int j = 0;
            while(j < menores25id.size()){
                if(id.equals(menores25id.get(j))) {
                    ganadores2.add(nombre.get(id));
                }
                j++;
            }
        }
    }

    public void ganadoresFinales(List<String> ganadores1, List<String> ganadores2, List<String> ganadoresFinales) {
        // Junte ambas listas para poder saber quienes ganaron en las dos categorias
        ganadores1.addAll(ganadores2);

        // Utilice el mismo metodo pero para encontrar cuales nombres de repetian, o sea que ganaron en las dos categorias.
        for(int n = 0; n < ganadores1.size(); n++) {
            for(int m = n+1; m < ganadores1.size(); m++){
                if(ganadores1.get(n).equals(ganadores1.get(m))) {
                    ganadoresFinales.add(ganadores1.get(m));
                }
            }
        }

        for(String ganador : ganadoresFinales) {
            System.out.println("Felicidades " + ganador + " has ganado un premio!");
        }
    }
}
