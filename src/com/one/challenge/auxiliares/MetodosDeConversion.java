package com.one.challenge.auxiliares;

public class MetodosDeConversion implements DatosYUnidades{
	
	/**
	 * esta funcion es para hacer los calculos de la convercion de las divisas
	 * @param opcion
	 * @param opcion2
	 * @param cantidad
	 * @param resultado
	 * @return
	 */
	public static double funcionDivisas(Double opcion, Double opcion2, Double cantidad, double resultado) {

		if(opcion == divisasValor[0]) {
			resultado = (cantidad*opcion2)/opcion;
			System.out.println("opcion 1 "+resultado);
		}else if (opcion2 == divisasValor[0]) {
			resultado = (cantidad*opcion2)/opcion;
			System.out.println("opcion 2 "+resultado);
		}else if(opcion != divisasValor[0] && opcion2 != divisasValor[0]) {
			resultado = (cantidad*(cantidad*PESO_COLOMBIANO)/opcion)*opcion2;
			System.out.println("opcion 3 "+resultado);
		}
		return Math.round(resultado * 1000.0)/1000.0;
	}

	/**
	 * Esta funcion es para la conversión de las unidades de temperatura
	 * @param opcion1
	 * @param opcion2
	 * @param cantidad
	 * @param resultado
	 * @return
	 */
	public static double funcionTemperatura(String opcion1, String opcion2,Double cantidad, double resultado) {
		if(opcion1 == grados[0] && opcion2 == grados[1]) {
			resultado = (cantidad * 9 / 5) + 32;
			System.out.println(" se combirtio de celsius a fahrenheit " + resultado);//1
		}else if(opcion1 == grados[0] && opcion2 == grados[2]) {
			resultado = cantidad + 273.15;
			System.out.println(" se combirtio de celsius a kelvin " + resultado);//3
		}else if(opcion1 == grados[1] && opcion2 == grados[0]) {
			resultado = (cantidad - 32)* 5/9;
			System.out.println(" se combirtio de farhentheit a celsius " + resultado);//2
		}else if(opcion1 == grados[2] && opcion2 == grados[0]) {
			resultado = cantidad - 273.15;
			System.out.println(" se combirtio de kelvin a celsius " + resultado);//4
		}else if(opcion1 == grados[1] && opcion2 == grados[2]) {
			resultado = (cantidad - 32) * 5/9 + 273.15;
			System.out.println(" se combirtio de farhentheit a kelvin " + resultado);//5
		}else if(opcion1 == grados[2] && opcion2 == grados[1]) {
			resultado = (cantidad - 273.15) * 9/5 + 32;
			System.out.println(" se combirtio de kelvin a farhentheit " + resultado);//6
		}
		return resultado;
	}
	
}
