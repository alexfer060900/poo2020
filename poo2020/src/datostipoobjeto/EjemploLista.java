package datostipoobjeto;

import java.util.ArrayList;
import java.util.List;


public class EjemploLista {
    public static void main(String[] args) {
        // Creacion de una lista en Java para almacenar valores de tipo String
        List<String> univs = new ArrayList<String>();
        univs.add("UTPL");
        univs.add("ESPOL");
        univs.add("UNL");
        univs.remove(1);
        System.out.println("Tamaño de la lista:" + univs.size());

        System.out.println("VALORES DE LA LISTA");
        univs.set(1, "UIDE");
        for (int i = 0; i < univs.size(); i ++){
            System.out.println(univs.get(i));
        }
    }
}
