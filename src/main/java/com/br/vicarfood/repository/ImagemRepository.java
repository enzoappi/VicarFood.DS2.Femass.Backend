package com.br.vicarfood.repository;

import com.br.vicarfood.model.Imagem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagemRepository extends JpaRepository<Imagem, Long> {
    
}
