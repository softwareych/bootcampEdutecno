package com.edutecno.estudio.vo;

import java.util.List;

import com.edutecno.estudio.modelo.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class CategoryVO {
	
	private List<Category> categorys;
	private String mensaje;
	private String codigo;

}
