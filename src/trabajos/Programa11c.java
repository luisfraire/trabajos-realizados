package trabajos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa11c {

	public static void main(String[] args) {
		byte ne;
		double s, max=8500.0, min=1500.0, total=0, isr=0.0;
		Scanner leer = new Scanner (System.in);
		DecimalFormat formateador = new DecimalFormat ("##,###.##");
		System.out.println ("Ingrese el número de empleados");
		ne = leer.nextByte();
		for (byte i=0; i<ne; i++){
			System.out.println ("Ingresa el sueldo del empleado " + i);
			s = leer.nextDouble();
			total+=s;
			if (s>min){
				min=s;
			}
			if (s<max){
				max=s;
			}
		}
		isr = total*0.33;
		System.out.println ("El total es "+formateador.format(total));
		System.out.println ("El ISR es "+ formateador.format(isr));
		System.out.println ("Salario máximo " + formateador.format(max));
		System.out.println ("Salario minimo "+ formateador.format(min));

	}

}
