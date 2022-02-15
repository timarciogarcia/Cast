package br.com.cast.avaliacao.dto;

import java.io.Serializable;

import br.com.cast.avaliacao.model.Categoria;

public class CategoriaDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String descricao;

	public CategoriaDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategoriaDto(Categoria obj) {
		super();
		this.id = obj.getId();
		this.descricao = obj.getDescricao();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
