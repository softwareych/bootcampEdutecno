package com.edutecno.estudio.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.edutecno.estudio.modelo.Brand;
import com.edutecno.estudio.modelo.Category;
import com.edutecno.estudio.modelo.Store;
import com.edutecno.estudio.servicio.IServicioBrand;
import com.edutecno.estudio.servicio.IServicioCategory;

import com.edutecno.estudio.servicio.IServicioProduct;
import com.edutecno.estudio.servicio.IServicioStore;

import com.edutecno.estudio.vo.ProductVO;


@Controller
@RequestMapping("/inventario")
public class ProductControlador {

	@Autowired
	IServicioProduct iServicioProduct;
	
	@Autowired
	IServicioStore iServicioStore;
	
	@Autowired
	IServicioCategory iServicioCategory;
	
	@Autowired
	IServicioBrand iServicioBrand;
	
	
	@GetMapping("/listar")//sera http://localhost:8080/films/listar
	public ModelAndView listar(
			@RequestParam(required =false) Integer storeId,
			@RequestParam(required =false) Integer categoryId ,
			@RequestParam(required =false) Integer brandId
			) {
		ModelAndView mav=new ModelAndView("monitorInventario");//así se debe llamar el html: listarFilm.html
		List<Category> comboCategory =iServicioCategory.ListCategory().getCategorys();
		mav.addObject("Categorys", comboCategory);
		
		List<Store> comboStore =iServicioStore.ListStoreVO().getStore();
		mav.addObject("Stores", comboStore);
		
		List<Brand> comboBrand =iServicioBrand.ListBrandVO().getBrand();
		mav.addObject("Brand", comboBrand);
		
		ProductVO productVO =iServicioProduct.listarProductoFiltrado(storeId, categoryId, brandId);
		mav.addObject("Products", productVO.getProducts());
		System.out.println(productVO.getProducts());
		mav.addObject("mensaje", productVO.getMensaje());
		
		return mav;
		
	}
}
