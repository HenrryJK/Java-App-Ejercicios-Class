package actividad;

import java.util.Scanner;

public class Employee extends Thread {
/* Problematica : Ingresar dos empleados , el dia y la hora que ingresaron
  a su centro de labores , e indicar si llego temprano o tarde , 
  cabe señalar que la hora de ingreso es a las 8:00.  
  */
	Scanner keyboard = new Scanner(System.in);
 @Override
	public void run() {
	 String employee;
	 	String day;
	 	int hours;
	 System.out.print("Escriba el nombre de los empleados: ");
	 employee = keyboard.nextLine();
	 System.out.print("Ingrese el dia: ");
	 day = keyboard.nextLine();
	 System.out.print("Ingresar la hora de su ingreso: ");
	 hours = keyboard.nextInt();
	 
	 if (hours > 8) {
		System.out.println("Usted ha llegado tarde...");
	} else {
		System.out.println("Bienvenido,por favor vaya al centro de labor.");
	}
	
	}



	
	
	
}
