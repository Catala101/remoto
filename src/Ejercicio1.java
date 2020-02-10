import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta="personas.txt";
		File fichero = new File(ruta);
		if (!fichero.exists()) {
			try {
				fichero.createNewFile();
				System.out.println("Archivo creado");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, false));
				Scanner sc = new Scanner (System.in);
				String introducir="";
				do {
					System.out.println("Introduce el dni de la persona:");
					String dni=sc.nextLine();
					System.out.println("Introduce el nombre:");
					String nombre=sc.nextLine();
					System.out.println("Introduce lo apellidos:");
					String apellidos=sc.nextLine();
					System.out.println("Introduce la dirección:");
					String direccion=sc.nextLine();
					System.out.println("Introduce el teléfono:");
					String telefono=sc.nextLine();
					System.out.println("Introduce el email:");
					String email=sc.nextLine();
					System.out.println("¿Desea introducir los datos de otra persona?");
					introducir=sc.nextLine();
					bw.write(dni +"//"+nombre +"//"+apellidos +"//"+direccion +"//"+ telefono + "//" + email);
					bw.newLine();
				}while(introducir.equalsIgnoreCase("si"));
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
