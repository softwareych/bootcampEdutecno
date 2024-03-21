package com.edutecno.estudio.vo;

import java.util.List;

import com.edutecno.estudio.modelo.Store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class StoreVO {
	private List<Store> store;
	private String mensaje;
	private String codigo;
}
