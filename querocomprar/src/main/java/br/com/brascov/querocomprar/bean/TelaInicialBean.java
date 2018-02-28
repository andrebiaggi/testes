package br.com.brascov.querocomprar.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.brascov.querocomprar.model.entity.Parametro;
import br.com.brascov.querocomprar.service.ParametroService;


@SessionScoped
@Named
public class TelaInicialBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String chave;
	private String valor;
	
	@Inject
	private ParametroService parametroService;
	
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
	
	public List<Parametro> getListaParametro() {
		return parametroService.getListaParametro();
	}
	
	public void addParametro() {
		Parametro parametro = new Parametro();
		parametro.setChave(chave);
		parametro.setValor(valor);
		
		parametroService.addParametro(parametro);
		
		chave = null;
		valor = null;
	}
	
	

}
