package org.example.ormescolamodelo;

import jakarta.transaction.Transactional;
import org.example.ormescolamodelo.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmEscolaModeloApplication implements CommandLineRunner {

	@Autowired
	private AlunoRepo alunoRepo;

	@Autowired
	private ContatoRepo contatoRepo;

	@Autowired
	private CursoRepo cursoRepo;

	@Autowired
	private DisciplinaRepo disciplinaRepo;

	@Autowired
	private ProfessorRepo professorRepo;

	@Autowired
	private ResponsavelRepo responsavelRepo;

	@Autowired
	private TurmaRepo turmaRepo;

	@Autowired
	private UsuarioRepo usuarioRepo;

	public static void main(String[] args) {
		SpringApplication.run(OrmEscolaModeloApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

	}

}
