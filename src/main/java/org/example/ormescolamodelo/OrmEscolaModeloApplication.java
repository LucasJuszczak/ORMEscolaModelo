package org.example.ormescolamodelo;

import jakarta.transaction.Transactional;
import org.example.ormescolamodelo.entidades.*;
import org.example.ormescolamodelo.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;

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
//		Aluno aluno = new Aluno();
//		aluno.setNome("Lucas Juszczak");
//		aluno.setNascimento(LocalDate.of(2002,5,12));
//		aluno.setEndereco("Logo Ali");
//		aluno.setNumero_matricula("2024001");
//		aluno.setCpf("12345678901");
//		alunoRepo.save(aluno);

//		Contato contato = new Contato();
//		contato.setDescricao("contato@email.com");
//		contato.setTipo("E-mail");
//		contatoRepo.save(contato);
//
//		Curso curso = new Curso();
//		curso.setNome("Tecnologia em Análise e Desenvolvimento de Sistemas");
//		curso.setCoordenador("Douglas");
//		cursoRepo.save(curso);
//
//		Disciplina disciplina = new Disciplina();
//		disciplina.setNome("Programação Orientada a Objetos II");
//		disciplinaRepo.save(disciplina);
//
//		Professor professor = new Professor();
//		professor.setNome("Tiago Roberto Kautzmann");
//		professorRepo.save(professor);
//
//		Responsavel responsavel = new Responsavel();
//		responsavel.setNome("Alguém Ali");
//		responsavel.setEndereco("Em Tal Lugar");
//		responsavelRepo.save(responsavel);
//
//		Turma turma = new Turma();
//		turma.setSemestre("4º Período");
//		turmaRepo.save(turma);
//
//		Usuario usuario = new Usuario();
//		usuario.setUsuario("Lucas");
//		usuario.setSenha("123456");
//		usuarioRepo.save(usuario);
	}
}
