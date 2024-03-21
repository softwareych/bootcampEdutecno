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
@Table(name="brands")
public class Brand {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "brand_id")
	private Integer brandId;
	
	@Column(name = "brand_name")
	private String brandName;

	@OneToMany(mappedBy="brand", fetch=FetchType.LAZY)
	private List<Product> listProducts;

}
