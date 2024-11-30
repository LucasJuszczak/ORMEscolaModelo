package org.example.ormescolamodelo.repositorios;

import org.example.ormescolamodelo.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends CrudRepository<Usuario, Integer> { }
