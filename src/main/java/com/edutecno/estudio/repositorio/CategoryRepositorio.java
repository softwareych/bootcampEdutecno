package com.edutecno.estudio.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;

import com.edutecno.estudio.modelo.Category;

public interface CategoryRepositorio extends JpaRepository<Category, Integer>{

}
