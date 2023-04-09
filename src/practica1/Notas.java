package practica1;
import java.util.Scanner;

/**
 * Clase notas para gestionar las notas de evaluacion de alumnos
 * 
 * @author Laura Martinez
 * @version 1.0.0
 */
 
public class Notas {
	//declaramos la variables que nos hacen falta
	double uf1, uf2, uf3;
	double acu1, acu2, acu3, notaFinal;
	
	//utilizamos escaner para poder introducir datos
	Scanner entrada = new Scanner(System.in);
	
	/**
	* Metodo que sirve para ingresar notas
	*/ 
	public void ingresaNotas() {
		//cuando ejecutamos este metodo lo primero que queremos es que nos pida notas
		System.out.println("Bienvenido");
		System.out.println("Introduce las notas del alumno");
		
		System.out.print("Ingrese nota 1: ");
		uf1= entrada.nextDouble();

		System.out.print("Ingrese nota 2: ");
		uf2= entrada.nextDouble();
		
		System.out.print("Ingrese nota 3: ");
		uf3= entrada.nextDouble();
		
		System.out.println("Has introducido los siguientes valores: " + uf1 + "," + uf2 + "," + uf3);
	}
	
	
	/**
	* Metodo que sirve para comprobar que se han introducido bien las notas
	*/ 
	
	public void comprobacion(){
		
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
		}else {
			System.out.println(" nota2 correcta");
		}
		
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
		}else {
			System.out.println(" nota3 correcta");
		}
	}
	
	
	/**
	* Metodo que sirve para calcular la nota
	* 
	* @param uf1 Nota obtenida en la Unidad 1
	* @param uf2 Nota obtenida en la Unidad 2
	* @param uf3 Nota obtenida en la Unidad 3
	* @return notaFinal Nota obtenida en la asignatura
	*/ 	
	
	public double calculoNotas(double uf1, double uf2, double uf3) {
		acu1= uf1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		
		notaFinal = acu1 + acu2+ acu3;
		//hasta aqui la tenemos calculada pero no la mostramos
		return notaFinal;
	}
	
	
	/**
	* Metodo que sirve para mostrar las notas
	*/ 
	
	public void mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumulado 1 = "+ acu1);
		System.out.println(" acumulado 2 = "+ acu2);
		System.out.println(" acumulado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ notaFinal);		
	}

	
	/**
	* Metodo que sirve para calcular si se ha aprobado
	*/ 
	
	public void aprobado() {
			if(notaFinal<5 && notaFinal>=0) {
				System.out.println("El alumno ha suspendido");
			}else {
				if (notaFinal>=5 && notaFinal<=10 ) {
				System.out.println("El alumno está aprobado");
				}else {
					System.out.println("Ha habido un error en las notas");
				}
			}
		}
		
		
	public static void main(String[] args) {
		
		// Mecanismos para llamar a cualquier método fuera de la clase
		
		Notas fc= new Notas();
		
		fc.ingresaNotas();
		
		fc.comprobacion();
		
		fc.mostrar();
		
		fc.aprobado();
		
	}

}
