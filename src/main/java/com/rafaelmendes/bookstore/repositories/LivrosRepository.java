package com.rafaelmendes.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafaelmendes.bookstore.domain.Livro;

@Repository
public interface LivrosRepository extends JpaRepository<Livro, Integer> {

}
