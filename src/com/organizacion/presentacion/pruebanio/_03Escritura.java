package com.organizacion.presentacion.pruebanio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class _03Escritura {

	public static void main(String[] args) {
		String ruta="nombres.txt";
		Path pt=Path.of(ruta);
		try {
			if(Files.notExists(pt)) {
				Files.createFile(pt);
			}
			Files.writeString(pt, "cadena1"+System.lineSeparator(),StandardOpenOption.APPEND);
			Files.writeString(pt, "cadena2"+System.lineSeparator(),StandardOpenOption.APPEND);
			Files.writeString(pt, "cadena3"+System.lineSeparator(),StandardOpenOption.APPEND);
		}
		catch(NoSuchFileException ex) {
			try {
				Files.createFile(pt);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
