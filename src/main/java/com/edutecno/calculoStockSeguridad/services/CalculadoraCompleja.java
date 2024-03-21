package com.edutecno.calculoStockSeguridad.services;

import java.util.ArrayList;
import java.util.List;

import com.edutecno.calculoStockSeguridad.interfaces.CalculadoraStockSeguridad;

public class CalculadoraCompleja implements CalculadoraStockSeguridad{

	@Override
	public List<Integer> calcula(List<Integer> listaStockActual) {
		// TODO Auto-generated method stub
		final Integer STOCKPORDEFECTO= 2;

		List<Integer> stockDeSeguridad = new ArrayList<>();

		for(int i=0;i<listaStockActual.size();i++) {
			System.out.println( listaStockActual.get(i));
			if(listaStockActual.get(i)>20) {
				stockDeSeguridad.add(i, (int) Math.round((STOCKPORDEFECTO + (listaStockActual.get(i) * 0.1))) );
			}else if(listaStockActual.get(i)>= 10 && listaStockActual.get(i) < 20) {
				stockDeSeguridad.add(i, (int)  Math.round((STOCKPORDEFECTO + (listaStockActual.get(i) * 0.05))) );
			}else {
				stockDeSeguridad.add(i, STOCKPORDEFECTO);
			}
			
		}
		
		return stockDeSeguridad;
	}

}
