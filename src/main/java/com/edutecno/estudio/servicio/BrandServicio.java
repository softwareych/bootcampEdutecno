package com.edutecno.estudio.servicio;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.estudio.modelo.Brand;
import com.edutecno.estudio.repositorio.BrandRepositorio;
import com.edutecno.estudio.vo.BrandVO;

@Service
public class BrandServicio implements IServicioBrand{
	private static final Logger logger=LoggerFactory.getLogger(BrandServicio.class);
	
	@Autowired
	private BrandRepositorio brandRepositorio;
	
	private BrandVO brandVO;

	@Override
	public BrandVO ListBrandVO() {
		// TODO Auto-generated method stub
		brandVO = new BrandVO(new ArrayList<Brand>(), "Ha ocurrido un error", "101");

		try {
			brandVO.setBrand(brandRepositorio.findAll());
			brandVO.setMensaje(String.format("Se encontraron %s marcas", brandVO.getBrand().size()));
			brandVO.setCodigo("0");
		}catch(Exception e){
			logger.error("BrandServicio: listar ", e);
		}
		return brandVO;
	}
	

}
