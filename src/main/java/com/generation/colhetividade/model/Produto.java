package com.generation.colhetividade.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome do produto é obrigatório!")
	@Size(min = 3, max = 100, message = "O nome do produto deve conter entre 3 e 100 caracteres.")
	private String nomeProduto;
	
	@NotBlank(message = "A quantidade do produto é obrigatória!")
	private Long quantidade;
	
	@NotBlank(message = "O preço do produto é obrigatório!")
	private Float  preco;
	
	@NotNull
	private Boolean IsDoacao;
	
	private String fotoProduto;
	
	// Qual anotação colocar?
	private Float doacaoTotal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public Boolean getIsDoacao() {
		return IsDoacao;
	}

	public void setIsDoacao(Boolean isDoacao) {
		IsDoacao = isDoacao;
	}

	public String getFotoProduto() {
		return fotoProduto;
	}

	public void setFotoProduto(String fotoProduto) {
		this.fotoProduto = fotoProduto;
	}

	public Float getDoacaoTotal() {
		return doacaoTotal;
	}

	public void setDoacaoTotal(Float doacaoTotal) {
		this.doacaoTotal = doacaoTotal;
	}
	
	
	
	

}
