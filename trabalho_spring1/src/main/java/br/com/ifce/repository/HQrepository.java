package br.com.ifce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifce.model.Quadrinho;


@Repository
public interface HQrepository extends JpaRepository<Quadrinho, Long>{

}
