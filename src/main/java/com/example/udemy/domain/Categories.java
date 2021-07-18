package com.example.udemy.domain;

import java.io.Serializable;
import java.util.Objects;

public class Categories implements Serializable {
	private static final long serialVersionUID = 1L;
	 
//Ao Serializable impelementar Categorires os objetos delas podem convertido para uma sequência de bits
//serve pra que os objetos possam ser gravados em arquivos e que possam trafegar me rede
	
	private Integer id;
	private String nome;
	
	public Categories() {		
	}

	public Categories(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		Categories other = (Categories) obj;
		return Objects.equals(id, other.id);
		
	}
}