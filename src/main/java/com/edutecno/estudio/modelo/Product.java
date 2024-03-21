package com.edutecno.estudio.modelo;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Integer productId;
	
	@Column(name = "product_name")
	private String productName;

	@Column(name = "model_year")
	private Integer modelYear;
	
	@Column(name = "list_price")
	private Double listPrice;
	
	@ManyToOne
    @JoinColumn(name="brand_id", nullable=false)
    private Brand brand;
	
	@ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private Category category;


	@OneToMany(mappedBy="product", fetch=FetchType.EAGER)
	private List<Stock> listStocks;

}
