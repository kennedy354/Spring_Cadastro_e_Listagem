package br.com.ifce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifce.model.Quadrinho;
import br.com.ifce.repository.HQrepository;

@Service
public class HQservice {
	
	@Autowired
	private HQrepository HQrepo;
	
	public void cadastrarHQ(Quadrinho quadrinho) {
		HQrepo.save(quadrinho);
	}
	
	public List<Quadrinho> listarHQs(){
		
		return HQrepo.findAll();
	}
}
