package com.organizacion.presentacion.pruebaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _02EjemploFileReader {
    public static void main(String[] args) {

        char[] buffer = new char[128];
        int caracterLeido;
        try {
            FileReader fEntrada = new FileReader("salida.txt");
            //leer el primer buffer
            caracterLeido = fEntrada.read(buffer);

            System.out.println("Caracteres leidos -> " + caracterLeido);
            for(int i=0; i<caracterLeido; i++){
                System.out.print(buffer[i]);
            }
            System.out.println();
            //leer los siguientes buffer si los hay

            fEntrada.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        //Instanciar la clase

    }
}
