package com.agustinbergomi.lib;

import java.util.HashMap;

public class MyClass {
    public static void main(String[] args) {
        //System.out.println("Hola");

        // array de 4 numeros
        int[] listado = {1,2,3,4};

        // declaracion de listado
        int[] listado2;

        String[] listado3 = {"hola","como","estas"};

        HashMap<String, Integer> listado_mapa = new HashMap<>();
        listado_mapa.put("Jorge", 32);
        listado_mapa.put("Juan",43);

        //System.out.println(listado + "\n" + listado3 + "\n" + listado_mapa);
        System.out.println(listado.toString());
        System.out.println(listado3.toString());
//        System.out.println(listado_mapa);


    }
}
