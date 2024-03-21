package com.edutecno.estudio.repositorio;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.edutecno.estudio.modelo.Product;

public interface ProductRepositorio extends JpaRepository<Product, Integer> {
	@Query(value = "SELECT * FROM stores "
			+ "JOIN stocks ON stores.store_id = stocks.store_id JOIN products ON stocks.product_id = products.product_id "
			+ "JOIN categories on categories.category_id = products.category_id "
			+ "WHERE stores.store_id =?1  AND categories.category_id =?2 AND brand.brand_id = ?3", nativeQuery = true)
	List<Product> listarProductoFiltrado(Integer storeId, Integer categoryId, Integer brandId);
}
