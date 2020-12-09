package cl.everis.operaciones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.everis.operaciones.service.OperacionService;

/**
 * Clase que implementa las operaciones basicas
 * Sumar, restar, multiplicar y dividir
 * @author david
 *
 */
@RestController
@RequestMapping("/operacion")
public class OperacionController {
	
	@Autowired
	OperacionService servicio;
	
	/**
	 * Operacion GET que suma 2 numeros
	 * @param primer valor ingresado
	 * @param segundo valor ingresado
	 * @return retorna la respuesta de el servicio implementado.
	 */
	@GetMapping(value = "/suma", produces = "application/json")
	public ResponseEntity<Double> sumar(@RequestParam Double num1, @RequestParam Double num2) {
		
		return new ResponseEntity<Double>(servicio.sumar(num1, num2), HttpStatus.OK);
	}
	
	/**
	 * Operacion GET que resta 2 numeros
	 * @param primer valor ingresado
	 * @param segundo valor ingresado
	 * @return retorna la respuesta de el servicio implementado.
	 */
	@GetMapping(value = "/resta", produces = "application/json")
	public ResponseEntity<Double> restar(@RequestParam Double num1, @RequestParam Double num2) {
		
		return new ResponseEntity<Double>(servicio.restar(num1, num2), HttpStatus.OK);
	}
	
	/**
	 * Operacion GET que multiplica 2 numeros
	 * @param primer valor ingresado
	 * @param segundo valor ingresado
	 * @return retorna la respuesta de el servicio implementado.
	 */
	@GetMapping(value = "/multiplicar", produces = "application/json")
	public ResponseEntity<Double> multiplicar(@RequestParam Double num1, @RequestParam Double num2) {
		
		return new ResponseEntity<Double>(servicio.multiplicar(num1, num2), HttpStatus.OK);
	}
	
	/**
	 * Operacion GET que divide 2 numeros
	 * @param primer valor ingresado
	 * @param segundo valor ingresado
	 * @return retorna la respuesta de el servicio implementado.
	 */
	@GetMapping(value = "/dividir", produces = "application/json")
	public ResponseEntity<Double> dividir(@RequestParam Double num1, @RequestParam Double num2) {
		
		return new ResponseEntity<Double>(servicio.dividir(num1, num2), HttpStatus.OK);
	}
	
	/**
	 * Operacion GET ordena los numeros recibidos de forma descendiente
	 * @param primer valor ingresado
	 * @param segundo valor ingresado
	 * @param tercer valor ingresado
	 * @param cuarto valor ingresado
	 * @param quinto valor ingresado
	 * @return retorna la respuesta de el servicio implementado.
	 */
	@GetMapping(value = "/ordenarNumeros", produces = "application/json")
	public ResponseEntity<String> ordenarNumeros(
			@RequestParam Double num1, 
			@RequestParam Double num2, 
			@RequestParam Double num3,
			@RequestParam Double num4,
			@RequestParam Double num5
			) {
		
		return new ResponseEntity<String>(servicio.ordenarNumeros(
				num1, 
				num2,
				num3,
				num4,
				num5), HttpStatus.OK);
	}

}
