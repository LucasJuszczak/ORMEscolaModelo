package org.example.ormescolamodelo.repositorios;

import org.example.ormescolamodelo.entidades.Disciplina;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepo extends CrudRepository<Disciplina, Integer> {
}
