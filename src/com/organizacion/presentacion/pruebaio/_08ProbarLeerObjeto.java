package com.organizacion.presentacion.pruebaio;



import com.organizacion.modelo.Producto;

import java.io.*;

public class _08ProbarLeerObjeto {

    public static void main(String[] args) {
        //1. Declarar las variables de instancia
        FileInputStream fEntrada;
        ObjectInputStream objeto = null;
        Producto p1;
        try {
            //2. Instanciar las clases
            fEntrada = new FileInputStream("productos.dat");
            objeto = new ObjectInputStream(fEntrada);
            while (true) {
                try {
                    p1 = (Producto) objeto.readObject();
                    System.out.println("Productos -> " + p1.toString());
                } catch (EOFException | ClassNotFoundException ex) {
                    break;
                }

            }
            fEntrada.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
