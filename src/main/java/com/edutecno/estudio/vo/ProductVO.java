package com.edutecno.estudio.vo;

import java.util.List;

import com.edutecno.estudio.modelo.Product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductVO {
	private List<Product> Products;
	private String mensaje;
	private String codigo;
}
