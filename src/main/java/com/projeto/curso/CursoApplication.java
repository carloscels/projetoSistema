package com.projeto.curso;

import com.projeto.curso.domain.Categoria;
import com.projeto.curso.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursoApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 =new Categoria(null,"Informatica");
		Categoria cat2 =new Categoria(null,"Escritorio");

		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
	}
}