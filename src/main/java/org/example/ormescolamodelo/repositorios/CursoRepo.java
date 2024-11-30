package org.example.ormescolamodelo.repositorios;

import org.example.ormescolamodelo.entidades.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepo extends CrudRepository<Curso, Integer> { }
