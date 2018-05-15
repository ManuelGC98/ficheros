package es.dual.ficheros.ficheros;

import java.io.File;
import java.io.FileOutputStream;
import java.security.SecureRandom;

import org.omg.CORBA_2_3.portable.OutputStream;

public class Ficheros {
	public static void main(String[] args) {
		// 1. Acceder a un directorio especfico de trabajo

		String ruta = "c:/listener";

		File directorio = new File(ruta);

		// 2. Crear un fichero con nombre "file_" + RANDOM + ".txt" y rellenar con contenido aleatorio
		SecureRandom random = new SecureRandom();
		
		OutputStream out;
		try
		{
			out = new FileOutputStream(new File(ruta + "file_" + random.nextLong() + ".txt"));
			StringBuffer datos = new StringBuffer();
			datos.append(random.nextLong() + " " + random.nextLong() + " " + random.nextLong());
			out.write(datos.toString().getBytes());
			out.close();
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
		
		
		/*for (String fichero : directorio.list()) {
			File temp = new File(ruta + "/" + fichero);

			if (!temp.isDirectory()) {
				System.out.println(fichero);
			}
		}*/

	}
}
