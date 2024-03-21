package com.edutecno.calculoStockSeguridad;

import java.util.ArrayList;
import java.util.List;

import com.edutecno.calculoStockSeguridad.services.CalculadoraCompleja;
import com.edutecno.calculoStockSeguridad.services.CalculadoraSimple;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-----------------------------------------------");
		System.out.println("Demostración Cálculo de Stock de Seguridad (Desarrollado por Yenny Chipamo)");
		System.out.println("-----------------------------------------------");
		System.out.println(" ");

		//Genera números aleatorios entre 0 y 50
		List<Integer> listaStockActual = new ArrayList<>();
		for(Integer i=0; i<5; i++) {
			listaStockActual.add((int)(Math.random()*50+0));
		}
		
		System.out.println("Tomando 5 valores de stock aleatorios");
		System.out.println(listaStockActual);
		System.out.println(" ");

		//Cálculo Algoritmo Simple
		List<Integer> stockSim = new ArrayList<>();
		CalculadoraSimple stockSimple = new CalculadoraSimple();
		stockSim.addAll(stockSimple.calcula(listaStockActual));
		System.out.println("Stocks de Seguridad con Algoritmo Simple: " + stockSim);

		//Cálculo Algoritmo Complejo
		List<Integer> stockComp = new ArrayList<>();
		CalculadoraCompleja stockComplejo = new CalculadoraCompleja();
		stockComp.addAll(stockComplejo.calcula(listaStockActual));
		System.out.println("Stocks de Seguridad con Algoritmo Complejo: " + stockComp);

	}

}
