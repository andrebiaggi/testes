package br.com.brascov.querocomprar.model.entity;

import java.io.Serializable;

public class Parametro implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String chave;
	private String valor;
	
	public String getChave() {
		return chave;
	}
	
	public void setChave(String chave) {
		this.chave = chave;
	}
	
	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}

}
