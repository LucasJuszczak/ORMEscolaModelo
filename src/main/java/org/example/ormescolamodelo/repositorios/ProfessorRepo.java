package org.example.ormescolamodelo.repositorios;

import org.example.ormescolamodelo.entidades.Professor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepo extends CrudRepository<Professor, Integer> { }
