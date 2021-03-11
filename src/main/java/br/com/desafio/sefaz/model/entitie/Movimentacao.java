package br.com.desafio.sefaz.model.entitie;

import java.sql.Date;

import br.com.desafio.sefaz.model.enums.Status;

public class Movimentacao {
	private Integer id;
	private String descricao;
	private Date vencimento;
	private Status status;
	private Double valor;

	public Integer getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public Status getStatus() {
		return status;
	}

	public Double getValor() {
		return valor;
	}

	public Movimentacao(Integer id, String descricao, Date vencimento, Status status, Double valor) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.vencimento = vencimento;
		this.status = status;
		this.valor = valor;
	}

}
