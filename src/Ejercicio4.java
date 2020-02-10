import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta="aparcamientos.txt";
		File fichero = new File(ruta);
		ArrayList <Aparcamiento> aparcamientos = new ArrayList <Aparcamiento>();
		Ejercicio4.cargarDatos(aparcamientos, ruta, fichero);
		Ejercicio4.mostrarPlazas(aparcamientos);
	}
	public static void mostrarPlazas(ArrayList <Aparcamiento> aparcamientos) {
		Scanner sc = new Scanner(System.in);
		int cont=0;
		System.out.println("Introduzca un barrio:");
		String barrio=sc.nextLine();
		boolean encontrado =false;
		for (int i = 0; i < aparcamientos.size(); i++) {
			if (barrio.equalsIgnoreCase(aparcamientos.get(i).getBarrio())) {
				encontrado= true;
				cont++;
			}else if(encontrado=false){
				System.out.println("El Barrio no ha sido encontrado.");
			}
		}
		System.out.println("El número de plazas en el Barrio introducido es de: " + cont + " plazas.");
		
		
	}
	public static void cargarDatos(ArrayList <Aparcamiento> aparcamientos, String ruta, File fichero) {
		
		if (fichero.exists()) {
			String linea = "";
			try {
				BufferedReader br = new BufferedReader(new FileReader(ruta));
				while (linea != null) {
					linea = br.readLine();

					if (linea != null) {
						
						String[] datos = linea.split("\\*\\*");
							Aparcamiento apar = new Aparcamiento(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5],datos[6]);
							aparcamientos.add(apar);
						
						
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
