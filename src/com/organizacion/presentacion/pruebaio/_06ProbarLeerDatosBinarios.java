package com.organizacion.presentacion.pruebaio;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _06ProbarLeerDatosBinarios {

    public static void main(String[] args) {
        // 1. Declarar Instancias de Clases
        FileInputStream fEntrada;
        DataInputStream dato;
        try {
            // 2. Instanciar las Clases correspondientes para leer
            fEntrada = new FileInputStream("tiposPrimitivos.dat");
            dato = new DataInputStream(fEntrada);
            // 3. Utilizar el método de lectura correspondiente al dato
            System.out.println("Dato de tipo byte -> " + dato.readByte());
            System.out.println("Dato de tipo entero -> " + dato.readInt());
            System.out.println("Dato de tipo short -> " + dato.readShort());
            System.out.println("Dato de tipo long -> " + dato.readLong());
            System.out.println("Dato de tipo float -> " + dato.readFloat());
            System.out.println("Dato de tipo double -> " + dato.readDouble());


            // 4. Cerrar el flujo
            fEntrada.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
