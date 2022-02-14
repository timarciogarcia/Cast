package br.com.cast.avaliacao.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Curso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String descricao;
	private LocalDate dtinicio;
	private LocalDate dtfim;
	private Integer qtdealunos;

	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;

	public Curso() {
		super();
	}

	public Curso(Integer id, String descricao, LocalDate dtinicio, LocalDate dtfim, Integer qtdealunos,
			Categoria categoria) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.dtinicio = dtinicio;
		this.dtfim = dtfim;
		this.qtdealunos = qtdealunos;
		this.categoria = categoria;
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

	public LocalDate getDtinicio() {
		return dtinicio;
	}

	public void setDtinicio(LocalDate dtinicio) {
		this.dtinicio = dtinicio;
	}

	public LocalDate getDtfim() {
		return dtfim;
	}

	public void setDtfim(LocalDate dtfim) {
		this.dtfim = dtfim;
	}

	public Integer getQtdealunos() {
		return qtdealunos;
	}

	public void setQtdealunos(Integer qtdealunos) {
		this.qtdealunos = qtdealunos;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(id, other.id);
	}

}
