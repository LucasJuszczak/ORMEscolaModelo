package org.example.ormescolamodelo.repositorios;

import org.example.ormescolamodelo.entidades.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepo extends CrudRepository<Aluno, Integer> { }