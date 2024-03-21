package com.edutecno.estudio;


import java.sql.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.edutecno.estudio.repositorio.CategoryRepositorio;


@SpringBootApplication
public class EstudioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudioApplication.class, args);
		
		//prueba sin necesidad de crear pagina web, es para evaluar que todo esté ok, para probar se requiere test junit
		
/*		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
		//CategoryRepositorio categoryRepo = acac.getBean(CategoryRepositorio.class);
		//System.out.println(categoryRepo.findAll());
		
		IServicioCategory category = acac.getBean(IServicioCategory.class);
		System.out.println(category.ListCategory().getCategorys());
				
		IServicioFilm films=acac.getBean(IServicioFilm.class);
		System.out.println(films.ListFilmPorParams("Action", "ACADEMY DINOSAUR",null).getFilms());//Date.valueOf("2005-01-01")
*/

	}

}
