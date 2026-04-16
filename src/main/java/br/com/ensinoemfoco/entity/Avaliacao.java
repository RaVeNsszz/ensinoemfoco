package br.com.ensinoemfoco.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "avaliacao")
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_aluno", nullable = false)
    private Aluno aluno;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_disciplina", nullable = false)
    private Disciplina disciplina;

    @Column(nullable = false)
    private Integer notaDisciplina;

    @Column(nullable = false)
    private Integer notaProfessor;

    @Column(nullable = false)
    private LocalDate dataAvaliacao;

    // GETTERS E SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Integer getNotaDisciplina() {
        return notaDisciplina;
    }

    public void setNotaDisciplina(Integer notaDisciplina) {
        this.notaDisciplina = notaDisciplina;
    }

    public Integer getNotaProfessor() {
        return notaProfessor;
    }

    public void setNotaProfessor(Integer notaProfessor) {
        this.notaProfessor = notaProfessor;
    }

    public LocalDate getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(LocalDate dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }
}