/*
 * OBJETO DO TIPO REPOSITORY PODE FAZER DIVERSAS OPERAÇOES DE 
 * ACESSO A DADO REFERENTES AO OBJETO DESTINADO.
 * 
 * */

package com.dio.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.desafio.domain.Endereco;

@Repository 
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> { 

} // Repository é Padronizado
