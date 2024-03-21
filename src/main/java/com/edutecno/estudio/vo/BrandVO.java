package com.edutecno.estudio.vo;

import java.util.List;

import com.edutecno.estudio.modelo.Brand;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class BrandVO {
	private List<Brand> brand;
	private String mensaje;
	private String codigo;
}
