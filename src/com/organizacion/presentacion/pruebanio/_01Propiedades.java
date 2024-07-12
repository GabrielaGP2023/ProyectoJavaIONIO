package com.organizacion.presentacion.pruebanio;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _01Propiedades {

    public static void main(String[] args) {
        //ruta relativa
        Path p1 = Paths.get("semana.txt");
        System.out.println("File Name: " + p1.getFileName());
        System.out.println("Is Absolute: " + p1.isAbsolute());
        System.out.println("Absolute Path: " + p1.toAbsolutePath());

        //ruta absoluta
        Path p2 = Paths.get(
        "C:\\Users\\ggp20\\Documents\\Cursos2024\\IFCT0609-CoreNetworks-2024\\Proyectos\\ProyectoJavaIONIO\\semana.txt");
        System.out.println("Original Path: " + p2);

        Path normalizedPath = p2.normalize();
        System.out.println("Normalized Path: " + normalizedPath);

        Path absolutePath = normalizedPath.toAbsolutePath();
        System.out.println("Absolute Path: " + absolutePath);

        Path realPath = null;
        try {
            realPath = absolutePath.toRealPath();
            System.out.println("Real Path: " + realPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
