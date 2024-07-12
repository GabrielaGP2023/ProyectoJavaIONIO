package com.organizacion.presentacion.pruebanio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class _02Atributos {
    public static void main(String[] args) {

        try {
            Path source = Paths.get("semana.txt");
            Path target = Paths.get("semana_copia.txt");

            // Copiar archivo
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully!");

            // Mover archivo
            Path movedTarget = Paths.get("moved_target.txt");
            Files.move(target, movedTarget, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully!");

            // Borrar archivo
            Files.delete(movedTarget);
            System.out.println("File deleted successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
