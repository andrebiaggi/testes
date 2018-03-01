package br.com.brascov.querocomprar.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.brascov.querocomprar.model.entity.Parametro;


@ManagedBean
@SessionScoped
public class ParametroService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Parametro> listaParametro = new ArrayList<Parametro>(); 
	
	public List<Parametro> getListaParametro() {
		return listaParametro;
	}
	
	public void addParametro(Parametro parametro) {
		listaParametro.add(parametro);
	}
	
	public void excluiParametro(Parametro parametro) {
		listaParametro.remove(parametro);
	}
	

}
