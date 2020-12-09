package cl.everis.operaciones.service;

import org.springframework.stereotype.Service;

/**
 * Servicio que implementa la logica de negocio del controlador "OperationController"
 * @author david
 *
 */
@Service
public class OperacionService {
	
	/**
	 * Metodo que valida y suma 2 numeros
	 * @param primer valor 
	 * @param segundo valor 
	 * @return retorna la suma de 2 numeros
	 */
	public Double sumar(Double num1, Double num2) {
		if(!validar(num1, num2)) throw new RuntimeException("Debe ingresar números válidos");
		
		return num1+num2;
	}
	
	/**
	 * Metodo que valida y resta 2 numeros
	 * @param primer valor 
	 * @param segundo valor 
	 * @return retorna la resta de 2 numeros
	 */
	public Double restar(Double num1, Double num2) {
		if(!validar(num1, num2)) throw new RuntimeException("Debe ingresar números válidos");
		
		return num1-num2;
	}
	
	/**
	 * Metodo que valida y multiplica 2 numeros
	 * @param primer valor 
	 * @param segundo valor 
	 * @return retorna la multiplicacion de 2 numeros
	 */
	public Double multiplicar(Double num1, Double num2) {
		if(!validar(num1, num2)) throw new RuntimeException("Debe ingresar números válidos");
		
		return num1*num2;
	}
	
	/**
	 * Metodo que valida y divide 2 numeros
	 * @param primer valor 
	 * @param segundo valor 
	 * @return retorna la division de dos numeros
	 */
	public Double dividir(Double num1, Double num2) {
		if(!validar(num1, num2)) throw new RuntimeException("Debe ingresar números válidos");
		if(!validarDiv(num2)) throw new RuntimeException("El segundo valor debe ser distinto de 0");
		
		return num1/num2;
	}

	/**
	 * Metodo que obtiene y ordena numeros de mayor a menor
	 * @param primer valor 
	 * @param segundo valor 
	 * @param tercer valor 
	 * @param cuarto valor 
	 * @param quinto valor 
	 * @return Cadena de texto con los numeros ordenados
	 */
	public String ordenarNumeros(
			Double num1, 
			Double num2,
			Double num3, 
			Double num4,
			Double num5) {
		
		Double[] numeros = {num1,num2,num3,num4,num5};
		
		 for (int x = 0; x < numeros.length; x++) {
			 for (int i = 0; i < numeros.length-x-1; i++) {	
				 if(numeros[i] < numeros[i+1]){
					 Double tmp = numeros[i+1];
					 numeros[i+1] = numeros[i];
					 numeros[i] = tmp;
		         }
		     }
		 }
		
		return  "\n" + numeros[0]
				+ "\n" + numeros[1]
				+ "\n" + numeros[2]
				+ "\n" + numeros[3]
				+ "\n" + numeros[4]
				;
	}
	
	/**
	 * Método que se encarga de validar que los numeros sean distintos de null
	 * @param primer valor 
	 * @param segundo valor 
	 * @return
	 */
	public Boolean validar(Double num1, Double num2) {
		if(num1 == null || num2 == null) {
			return false;
		}else {
			return true;
		}
	}
	
	/**
	 * Método que se encarga de validar que num2 sea distinto de 0
	 * @param segundo valor
	 * @return
	 */
	public Boolean validarDiv(Double num2) {
		if(num2.compareTo(0D) == 0) {
			return false;
		}else {
			return true;
		}
	}
}
