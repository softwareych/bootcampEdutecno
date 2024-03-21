package com.edutecno.estudio.servicio;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.estudio.modelo.Store;

import com.edutecno.estudio.repositorio.StoreRepositorio;

import com.edutecno.estudio.vo.StoreVO;

@Service
public class StoreServicio implements IServicioStore {
	private static final Logger logger=LoggerFactory.getLogger(StoreServicio.class);
	
	@Autowired
	private StoreRepositorio storeRepositorio;
	
	private StoreVO storeVO;

	@Override
	public StoreVO ListStoreVO() {
		// TODO Auto-generated method stub
		storeVO = new StoreVO(new ArrayList<Store>(), "Ha ocurrido un error", "101");

		try {
			storeVO.setStore(storeRepositorio.findAll());
			storeVO.setMensaje(String.format("Se encontraron %s tiendas", storeVO.getStore().size()));
			storeVO.setCodigo("0");
		}catch(Exception e){
			logger.error("StoreServicio: listar ", e);
		}
		return storeVO;
	}
	


}
