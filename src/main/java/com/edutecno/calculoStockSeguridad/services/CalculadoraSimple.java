package com.edutecno.calculoStockSeguridad.services;

import java.util.ArrayList;
import java.util.List;

import com.edutecno.calculoStockSeguridad.interfaces.CalculadoraStockSeguridad;

public class CalculadoraSimple implements CalculadoraStockSeguridad{

	@Override
	public List<Integer> calcula(List<Integer> listaStockActual) {
		// TODO Auto-generated method stub
		final Integer STOCKPORDEFECTO= 2;
		
		List<Integer> stockDeSeguridad = new ArrayList<>();

		for(int i=0;i<listaStockActual.size();i++) {
			stockDeSeguridad.add(i, STOCKPORDEFECTO);
		}
		
		return stockDeSeguridad;
	}

}
