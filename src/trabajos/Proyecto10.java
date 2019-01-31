package trabajos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Proyecto10 {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		DecimalFormat formateador = new DecimalFormat ("####.##");
		double prod1, prod2, prod3, sum, desc;
		System.out.println ("Precio del producto 1 ");
		prod1 = leer.nextDouble();
		System.out.println ("Precio del producto 2 ");
		prod2 = leer.nextDouble();
		System.out.println ("Precio del producto 3 ");
		prod3 = leer.nextDouble();
		sum = (prod1+prod2+prod3);
		System.out.println ("La suma total es de: ");
		System.out.println (formateador.format (sum));
	 if (sum>=1500)
		{
			System.out.println ("El descuento es del 11%");
			desc = ((sum*11)/100);
			System.out.println ("De " + sum + " el 11% es de ");
			System.out.println (formateador.format (desc));
			desc = sum - desc;
			System.out.println ("El total a pagar es de: ");
			System.out.println (formateador.format (desc));
		}
		if (sum<1500)
		{
			System.out.println ("El descuento es del 10%");
			desc = ((sum*10)/100);
			System.out.println ("De " + sum + " el 10% es de ");
			System.out.println  (formateador.format (desc));
			desc = sum - desc;
			System.out.println ("El total a pagar es de: ");
			System.out.println (formateador.format (desc));
		}
	}

}
