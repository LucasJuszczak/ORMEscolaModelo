package org.example.ormescolamodelo.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Aluno {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private LocalDate nascimento;
    private String endereco;
    private String numero_matricula;
    private String cpf;

    @OneToMany(mappedBy = "aluno")
    private List<Contato> contatos = new ArrayList<Contato>();

    @OneToMany
    private List<Usuario> usuarios = new ArrayList<Usuario>();

    @ManyToMany
    private List<Responsavel> responsaveis;

    @ManyToMany
    private List<Turma> turmas;
}
