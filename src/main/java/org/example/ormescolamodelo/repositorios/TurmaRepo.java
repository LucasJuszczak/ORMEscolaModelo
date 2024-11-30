package org.example.ormescolamodelo.repositorios;

import org.example.ormescolamodelo.entidades.Turma;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepo extends CrudRepository<Turma, Integer> { }
