package es.dual.ficheros.ficheros;

import java.io.File;

public class Ficheros {
	public static void main(String[] args) {
		// 1. Acceder a un directorio especfico de trabajo

		String ruta = "c:/listener";

		File directorio = new File(ruta);

		for (String fichero : directorio.list()) {
			File temp = new File(ruta + "/" + fichero);

			if (!temp.isDirectory()) {
				System.out.println(fichero);
			}
		}

	}
}
