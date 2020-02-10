import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta="aparcamientos.txt";
		File fichero = new File(ruta);
		ArrayList <Aparcamiento> aparcamientos2 = new ArrayList <Aparcamiento>();
		Ejercicio5.cargarDatos(aparcamientos2, ruta, fichero);
		Ejercicio5.mostrarDatos(aparcamientos2);
	}
	
	public static void mostrarDatos(ArrayList <Aparcamiento> aparcamientos2) {
		for (int i = 0; i < aparcamientos2.size(); i++) {
			if (aparcamientos2.get(i).getBarrio().equalsIgnoreCase("07-01 GAZTAMBIDE"))
			System.out.println(aparcamientos2.get(i).toString());
		}
	}
	
	public static void cargarDatos(ArrayList <Aparcamiento> aparcamientos2, String ruta, File fichero) {
		
		if (fichero.exists()) {
			String linea = "";
			try {
				BufferedReader br = new BufferedReader(new FileReader(ruta));
				while (linea != null) {
					linea = br.readLine();

					if (linea != null) {
						
						String[] datos = linea.split("\\*\\*");
							Aparcamiento apar = new Aparcamiento(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5],datos[6]);
							aparcamientos2.add(apar);
						
						
					}
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			try {
				fichero.createNewFile();
				System.out.println("El fichero ha sido creado.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}

}
