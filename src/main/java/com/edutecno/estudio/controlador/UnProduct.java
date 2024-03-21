package com.edutecno.estudio.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.edutecno.estudio.modelo.Product;
import com.edutecno.estudio.servicio.IServicioProduct;

@Controller
@RequestMapping("/unProducto")
public class UnProduct {
	@Autowired
	IServicioProduct iServicioProduct;

	@GetMapping("/listarProductById") // sera http://localhost:8080/films/listar
	public ModelAndView listarProductById(@RequestParam(required = false) Integer id) {
		ModelAndView mav = new ModelAndView("unProducto");// html
		Product unProduct = iServicioProduct.listarByid(id).getProducts().get(0);

		mav.addObject("UnProduct", unProduct);// ese nombre es para el html el for

		return mav;
	}
}
