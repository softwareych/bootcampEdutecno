package com.edutecno.estudio.modelo;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="stocks")
public class Stock implements Serializable {
	@ManyToOne
	@Id
    @JoinColumn(name="product_id", nullable=false)
    private Product product;
	
	@ManyToOne
	@Id
    @JoinColumn(name="store_id", nullable=false)
    private Store store;
	
	private String quantity;
}
