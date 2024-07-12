package com.organizacion.presentacion.pruebaio;



import com.organizacion.modelo.Producto;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class _07ProbarEscribirObjeto {
    public static void main(String[] args) {
        // 1. Declarar las variables de referencia
        FileOutputStream fSalida;
        ObjectOutputStream objeto;
        Producto p1, p2;

        try {
            //Instanciar los objetos
            fSalida = new FileOutputStream("productos.dat");
            objeto = new ObjectOutputStream(fSalida);
            p1 = new Producto("Ratón inalambrico", 10, 12);
            p2 = new Producto("Teclado negro", 5, 30);
            objeto.writeObject(p1);
            objeto.writeObject(p2);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
