package com.organizacion.presentacion.pruebanio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class _04PEscrituraColeccion {
    public static void main(String[] args) {
        String ruta="semana.txt";
        Path pt = Path.of(ruta);
        List<String> dias = List.of("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo");
        try {
            if(Files.notExists(pt)){
                Files.createFile(pt);
            }
            Files.write(pt,dias, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}