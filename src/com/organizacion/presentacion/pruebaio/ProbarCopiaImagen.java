package com.organizacion.presentacion.pruebaio;

import java.io.*;

public class ProbarCopiaImagen {
    public static void main(String[] args) {
        // TODO code application logic here
        FileOutputStream fs;
        DataOutputStream ds;
        FileInputStream fe;
        DataInputStream de;
        try {
            fs = new FileOutputStream("tokio2020-copia.jpg");
            ds = new DataOutputStream(fs);
            fe = new FileInputStream("tokio2020.jpg");
            de = new DataInputStream(fe);
            while (de.available()>0) {
                ds.write(de.read());

            }
            ds.close();
            fs.close();
            de.close();
            fe.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

}
