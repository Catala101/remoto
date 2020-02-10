import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta="Inmuebles.txt";
		File fichero = new File(ruta);
		ArrayList <Inmueble> inmuebles = new ArrayList <Inmueble>();
		Ejercicio2.cargarDatos(inmuebles, ruta, fichero);
		Ejercicio2.generarArchivo(inmuebles);
		
		
	}
	public static void generarArchivo(ArrayList <Inmueble> inmuebles) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Venta2007.txt"));
			for (int j = 0; j < inmuebles.size(); j++) {
				bw.write(inmuebles.get(j).getId() + ";" + inmuebles.get(j).getFecha_alta() + ";" + inmuebles.get(j).getTipo() + ";" + inmuebles.get(j).getOperacion() + ";" + inmuebles.get(j).getProvincia() + ";" + inmuebles.get(j).getSuperficie() + ";" + inmuebles.get(j).getPrecio() + ";" + inmuebles.get(j).getFecha_venta() + ";" + inmuebles.get(j).getVendedor());
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
}
		public static void cargarDatos(ArrayList <Inmueble> inmuebles, String ruta, File fichero) {
			if (fichero.exists()) {
				String linea = "";
				try {
					BufferedReader br = new BufferedReader(new FileReader(ruta));
					while (linea != null) {
						linea = br.readLine();

						if (linea != null) {
							
							String[] datos = linea.split("\\;");
							if (datos[7].endsWith("07")) {
								Inmueble dom = new Inmueble(Integer.parseInt(datos[0]), datos[1], datos[2], datos[3], datos[4], datos[5],datos[6], datos[7], datos[8]);
								inmuebles.add(dom);
							}
							
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
