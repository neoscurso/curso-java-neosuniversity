package com.neosuniversity.strings;

/**
 * @author neosuniverty
 * @version 1.0
 * Manejo de Srting API
 */
public class StringPart3 {

    public static void main(String[] args) {
        String nombre = "Gloria";

        String nombre2 = "Gloria";

        String nombre3 = new String("Gloria");

        String nombre4 = new String("GLORIA");


        if (nombre == nombre2) {
            System.out.println("Iguales");
        }

        if (nombre == nombre3) {
            System.out.println("Iguales");
        } else {
            System.out.println("Distintos");
        }


        if (nombre3.equals(nombre)){
            System.out.println("Iguales");
        }

        if (nombre3.equalsIgnoreCase(nombre4)){
            System.out.println("iguales");
        }

    }
}
