package com.edutecno.estudio.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edutecno.estudio.modelo.Product;
import com.edutecno.estudio.servicio.ProductServicio;

@RestController
@RequestMapping("/api/v1")
public class ProductRestController {
	@Autowired
	private ProductServicio productServicio;
	
	@GetMapping("/inventario/listar")
	public List<Product> listar(
							@RequestParam(value = "store", defaultValue ="") Integer storeId,
							@RequestParam(value="category", defaultValue ="") Integer categoryId,
							@RequestParam(value="brand", defaultValue ="") Integer brandId
			){

		return (List<Product>) productServicio.listarProductoFiltrado(storeId, categoryId, brandId);
	}
}
