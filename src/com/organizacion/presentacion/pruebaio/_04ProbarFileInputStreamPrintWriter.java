package com.organizacion.presentacion.pruebaio;

import java.io.*;

public class _04ProbarFileInputStreamPrintWriter {
    public static void main(String[] args) {
        File archivo = new File("datos.txt");
        try {
            // Crea un BufferedReader para leer la entrada estandar
            InputStreamReader entrada = new InputStreamReader(System.in);
            BufferedReader bufEntrada = new BufferedReader(entrada);
            // Crea un print write para escribir en el archivo
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            String s;
            System.out.println("Inserte el texto del archivo");
            System.out.println(" Inserte ctrl-z para detener");
            // Escribe cada linea y lo pone en pantalla
//            while((s=bufEntrada.readLine()) != null){
            s = bufEntrada.readLine();
            salida.print(s);
//            }
            // Cierra el bufferedReader y el PrintWriter
            bufEntrada.close();
            salida.close();

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
