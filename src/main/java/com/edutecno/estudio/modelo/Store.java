package com.edutecno.estudio.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="stores")
public class Store {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "store_id")
	private Integer storeId;
	
	@Column(name = "store_name")
	private String storeName;
	
	private String phone;
	
	private String email;
	private String street;
	private String city;
	private String state;
	
	@Column(name = "zip_code")
	private String zipCode;
	

	@OneToMany(mappedBy="store", fetch=FetchType.EAGER)
	private List<Stock> listStock;
}
