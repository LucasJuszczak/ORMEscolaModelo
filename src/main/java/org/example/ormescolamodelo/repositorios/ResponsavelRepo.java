package org.example.ormescolamodelo.repositorios;

import org.example.ormescolamodelo.entidades.Responsavel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsavelRepo extends CrudRepository<Responsavel, Integer> { }
