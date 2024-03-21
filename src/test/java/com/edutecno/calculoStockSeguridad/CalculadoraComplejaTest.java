package com.edutecno.calculoStockSeguridad;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.edutecno.calculoStockSeguridad.services.CalculadoraCompleja;

@DisplayName("Test para Algoritmo de Calculadora Compleja")
class CalculadoraComplejaTest {

	private static Logger logger= Logger.getLogger("com.edutecno.calculoStokSeguriddad.CalculadoraComplejaTest");
	
	@BeforeAll
	static void setup() {
		logger.info("Inicio de pruebas CalculadoraComplejaTest");
	}
	
	@BeforeEach
	void init() {
		logger.info("Inicio método con Resultados");
	}
	
	@Test
	void cuandoElAlgoritmoGeneraResultadoOk() {
		logger.info("Test cuandoElAlgoritmoGeneraResultadoOk");

		List<Integer> listaStockActual = new ArrayList<>();
		listaStockActual.add(7);
		listaStockActual.add(26);
		listaStockActual.add(39);
		listaStockActual.add(12); 
		
		List<Integer> stockComp = new ArrayList<>();
		CalculadoraCompleja stockCompleja = new CalculadoraCompleja();
		stockComp.addAll(stockCompleja.calcula(listaStockActual));

		Integer res1 = 2;
		Integer res2 = 5;
		Integer res3 = 6;
		Integer res4 = 3;
		
		assertEquals(res1, stockComp.get(0));
		assertEquals(res2, stockComp.get(1));
		assertEquals(res3, stockComp.get(2));
		assertEquals(res4, stockComp.get(3));
	}
	
	@Test
	void cuandoElAlgoritmoGeneraResultadoNoOk() {
		logger.info("Test cuandoElAlgoritmoGeneraResultadoNoOk");

		List<Integer> listaStockActual = new ArrayList<>();
		listaStockActual.add(7);
		listaStockActual.add(26);
		listaStockActual.add(39);
		listaStockActual.add(12); 
		
		List<Integer> stockComp = new ArrayList<>();
		CalculadoraCompleja stockCompleja = new CalculadoraCompleja();
		stockComp.addAll(stockCompleja.calcula(listaStockActual));

		Integer resp1=listaStockActual.get(0);
		Integer res1 = 3;
		
		Integer resp2=listaStockActual.get(1);
		Integer res2 = 8;
		
		Integer resp3=listaStockActual.get(2);
		Integer res3 = 3;
		
		assertFalse(resp1.equals(res1));
		assertFalse(resp2.equals(res2));
		assertFalse(resp3.equals(res3));

	}

}
