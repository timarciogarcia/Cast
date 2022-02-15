package br.com.cast.avaliacao.controller;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cast.avaliacao.dto.CategoriaDto;
import br.com.cast.avaliacao.model.Categoria;
import br.com.cast.avaliacao.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> findByid(@PathVariable Integer id) {
		Categoria obj = categoriaService.findByid(id);
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping
	public ResponseEntity<List<CategoriaDto>> findAll() {
		List<Categoria> list = categoriaService.findAll();
		List<CategoriaDto> listdto = list.stream().map(obj -> new CategoriaDto(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listdto);
	}

}
