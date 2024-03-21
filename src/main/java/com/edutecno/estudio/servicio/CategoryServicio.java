package com.edutecno.estudio.servicio;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.estudio.modelo.Category;
import com.edutecno.estudio.repositorio.CategoryRepositorio;
import com.edutecno.estudio.vo.CategoryVO;

@Service
public class CategoryServicio implements  IServicioCategory{

	private static final Logger logger=LoggerFactory.getLogger(CategoryServicio.class);
			
	@Autowired
	private CategoryRepositorio categoryRepositorio;
	
	private CategoryVO categoryVO;
	
	@Override
	public CategoryVO ListCategory() {
		// TODO Auto-generated method stub
		categoryVO = new CategoryVO(new ArrayList<Category>(), "Ha ocurrido un error", "101");
		try {
			categoryVO.setCategorys(categoryRepositorio.findAll());
			categoryVO.setMensaje(String.format("Se encontraron %s categorías", categoryVO.getCategorys().size()));
			categoryVO.setCodigo("0");
		}catch(Exception e){
			logger.error("CategoryServicio: listar ", e);
		}
		return categoryVO;
	}


}
