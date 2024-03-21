package com.edutecno.estudio.servicio;

import com.edutecno.estudio.vo.ProductVO;

public interface IServicioProduct {

	ProductVO listarProductoFiltrado(Integer storeId, Integer categoryId, Integer brandId);
	ProductVO listarByid(Integer id);
}
