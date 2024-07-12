package com.organizacion.presentacion.pruebaio;

import java.io.FileWriter;
import java.io.IOException;

public class _01EjemploFileWriter {
    public static void main(String[] args) {

        String nombreFicheroSalida = "salida.txt";
        //Instanciar fichero de salida
        try {
            FileWriter fsalida = new FileWriter(nombreFicheroSalida);
            fsalida.write("Escribiendo desde java en fichero Hola mundo !!!");
            fsalida.flush();
            fsalida.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
