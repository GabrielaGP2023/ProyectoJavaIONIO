package com.organizacion.presentacion.pruebanio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _05LecturaColeccion {

    public static void main(String[] args) {
        String ruta="semana.txt";
        Path p = Path.of(ruta);
        try {
            System.out.println(Files.readAllLines(p));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
