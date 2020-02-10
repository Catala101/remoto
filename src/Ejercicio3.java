import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta="Inmuebles.txt";
		File fichero = new File(ruta);
		ArrayList <Inmueble> inmuebles2 = new ArrayList <Inmueble>();
		Ejercicio3.cargarDatos(inmuebles2, ruta, fichero);
		Ejercicio3.generarArchivo(inmuebles2);
	}
	
	public static void generarArchivo(ArrayList <Inmueble> inmuebles2) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("parkings.txt"));
			for (int j = 0; j < inmuebles2.size(); j++) {
				bw.write(inmuebles2.get(j).getId() + ";" + inmuebles2.get(j).getFecha_alta() + ";" + inmuebles2.get(j).getTipo() + ";" + inmuebles2.get(j).getOperacion() + ";" + inmuebles2.get(j).getProvincia() + ";" + inmuebles2.get(j).getSuperficie() + ";" + inmuebles2.get(j).getPrecio() + ";" + inmuebles2.get(j).getFecha_venta() + ";" + inmuebles2.get(j).getVendedor());
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
}
		public static void cargarDatos(ArrayList <Inmueble> inmuebles2, String ruta, File fichero) {
			if (fichero.exists()) {
				String linea = "";
				try {
					BufferedReader br = new BufferedReader(new FileReader(ruta));
					while (linea != null) {
						linea = br.readLine();

						if (linea != null) {
							
							String[] datos = linea.split("\\;");
							if (datos[2].equalsIgnoreCase("-Parking")) {
								Inmueble dom = new Inmueble(Integer.parseInt(datos[0]), datos[1], datos[2], datos[3], datos[4], datos[5],datos[6], datos[7], datos[8]);
								inmuebles2.add(dom);
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
