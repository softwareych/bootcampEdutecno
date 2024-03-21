package com.edutecno.estudio.servicio;

import java.util.ArrayList;

import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.estudio.modelo.Product;
import com.edutecno.estudio.repositorio.ProductRepositorio;

import com.edutecno.estudio.vo.ProductVO;

@Service
public class ProductServicio implements IServicioProduct {
	private static final Logger logger = LoggerFactory.getLogger(CategoryServicio.class);

	@Autowired
	private ProductRepositorio productRepositorio;

	private ProductVO productVO;

	@Override
	public ProductVO listarProductoFiltrado(Integer storeId, Integer categoryId, Integer brandId) {
		// TODO Auto-generated method stub
		productVO = new ProductVO(new ArrayList<Product>(), "Ha ocurrido un error", "101");
		try {
			if (categoryId!=null || brandId!=null || storeId!=null  ) {
				productVO.setProducts(productRepositorio.findAll().stream()
 						.filter(f -> f.getCategory().getCategoryId().equals(categoryId) || f.getBrand().getBrandId().equals(brandId)  )
 						.collect(Collectors.toList()));
				
				/*productVO.setProducts(productRepositorio.findAll().stream()
 						.filter(f -> f.getCategory().getCategoryId().equals(categoryId) || f.getBrand().getBrandId().equals(brandId) || f.getListStocks().get(0).getStore().getStoreId().equals(storeId) )
 						.collect(Collectors.toList()));
				*/

			} else {
				productVO.setProducts(productRepositorio.findAll());
			}
			productVO.setMensaje(String.format("Se encontraron %s poductos", productVO.getProducts().size()));
			productVO.setCodigo("0");
		} catch (Exception e) {
			logger.error("ProductServicio: listar ", e);
		}
		return productVO;
	}

	@Override
	public ProductVO listarByid(Integer id) {
		// TODO Auto-generated method stub
		productVO = new ProductVO(new ArrayList<Product>(), "Ha ocurrido un error", "102");
		try {
			if (id!=null) {
				productVO.setProducts(productRepositorio.findAll().stream()
						.filter(f -> f.getProductId().equals(id)).collect(Collectors.toList()));
			} else {
				productVO.setProducts(productRepositorio.findAll());
			}
			productVO.setMensaje(String.format("Se encontraron %s productos", productVO.getProducts().get(0).getProductName()));
			productVO.setCodigo("0");
		} catch (Exception e) {
			logger.error("ProductServicio: listar ", e);
		}
		return productVO;
	}

}
