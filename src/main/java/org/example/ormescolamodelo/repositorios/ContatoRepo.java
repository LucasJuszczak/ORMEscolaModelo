package org.example.ormescolamodelo.repositorios;

import org.example.ormescolamodelo.entidades.Contato;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepo extends CrudRepository<Contato, Integer> { }