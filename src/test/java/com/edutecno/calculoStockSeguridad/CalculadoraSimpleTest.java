package com.edutecno.calculoStockSeguridad;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.edutecno.calculoStockSeguridad.services.CalculadoraSimple;

@DisplayName("Test para Algoritmo de Calculadora Simple")
class CalculadoraSimpleTest {
	
	private static Logger logger= Logger.getLogger("com.edutecno.calculoStokSeguriddad.CalculadoraSimpleTest");
	
	@BeforeAll
	static void setup() {
		logger.info("Inicio de pruebas CalculadoraSimpleTest");
	}
	
	@BeforeEach
	void init() {
		logger.info("Inicio método con Resultados ");
	}

	@Test
	void cuandoElAlgoritmoGeneraResultadoOk() {
		logger.info("Test cuandoElAlgoritmoGeneraResultadoOk");

		List<Integer> listaStockActual = new ArrayList<>();
		listaStockActual.add(7);
		listaStockActual.add(26);
		listaStockActual.add(39);
		listaStockActual.add(12); 
		
		List<Integer> stockSim = new ArrayList<>();
		CalculadoraSimple stockSimple = new CalculadoraSimple();
		stockSim.addAll(stockSimple.calcula(listaStockActual));

		Integer resultado =2; 
		assertEquals(resultado, stockSim.get(0));
		assertEquals(resultado, stockSim.get(1));
		assertEquals(resultado, stockSim.get(2));
		assertEquals(resultado, stockSim.get(3));
	}

	@Test
	void cuandoElAlgoritmoGeneraResultadoNoOk() {
		logger.info("Test cuandoElAlgoritmoGeneraResultadoNoOk");

		List<Integer> listaStockActual = new ArrayList<>();
		listaStockActual.add(7); 
		
		List<Integer> stockSim = new ArrayList<>();
		CalculadoraSimple stockSimple = new CalculadoraSimple();
		stockSim.addAll(stockSimple.calcula(listaStockActual));

		Integer respuesta=listaStockActual.get(0);
		Integer resultado =3; 
		assertFalse(respuesta.equals(resultado));
	}
	
	/*@Test
	void cuandoLaListaContieneCiertoValor() {
		logger.info("Test cuandoElAlgoritmoGeneraResultadoNoOk");

		List<Integer> listaStockActual = new ArrayList<>();
		listaStockActual.add(2); 
		
		List<Integer> stockSim = new ArrayList<>();
		CalculadoraSimple stockSimple = new CalculadoraSimple();
		stockSim.addAll(stockSimple.calcula(listaStockActual));

		Integer respuesta=listaStockActual.get(0);
		Integer resultado =2;
		
		assertArrayEquals(respuesta.equals(2),resultado.equals(2),"Debería tener el mismo resultado");

	}*/
	
	/*@Test
	void cuandoElAlgoritmoGeneraResultadoEsNulo() {
		logger.info("Test cuandoElAlgoritmoGeneraResultadoEsNulo");

		List<Integer> listaStockActual = new ArrayList<>();
		
		List<Integer> stockSim = new ArrayList<>();
		CalculadoraSimple stockSimple = new CalculadoraSimple();
		stockSim.addAll(stockSimple.calcula(listaStockActual));

		Integer respuesta=listaStockActual.get(0);
		Integer resultado ; 
		assertNull("",resultado);
	}*/
}
