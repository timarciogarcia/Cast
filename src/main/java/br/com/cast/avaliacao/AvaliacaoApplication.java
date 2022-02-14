package br.com.cast.avaliacao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.cast.avaliacao.model.Categoria;
import br.com.cast.avaliacao.model.Curso;
import br.com.cast.avaliacao.repository.CategoriaRepository;
import br.com.cast.avaliacao.repository.CursoRepository;

@SpringBootApplication
public class AvaliacaoApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private CursoRepository cursoRepository;

	public static void main(String[] args) {
		SpringApplication.run(AvaliacaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Comportamental");
		Categoria cat2 = new Categoria(null, "Programação");
		Categoria cat3 = new Categoria(null, "Qualidade");
		Categoria cat4 = new Categoria(null, "Processos");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dtinicial = sdf.parse("14/02/2022");
		Date dtfinal = sdf.parse("28/02/2022");

		Curso cur1 = new Curso(null, "Curso de Scrum Master", dtinicial, dtfinal, 10, cat4);
		Curso cur2 = new Curso(null, "Curso de Java", dtinicial, dtfinal, 10, cat2);
		Curso cur3 = new Curso(null, "Curso de Recursos Humanos", dtinicial, dtfinal, 10, cat1);
		Curso cur4 = new Curso(null, "Curso de QA", dtinicial, dtfinal, 10, cat4);
		Curso cur5 = new Curso(null, "Curso de Metodo Agil", dtinicial, dtfinal, 10, cat3);

		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));
		this.cursoRepository.saveAll(Arrays.asList(cur1, cur2, cur3, cur4, cur5));
	}
}
