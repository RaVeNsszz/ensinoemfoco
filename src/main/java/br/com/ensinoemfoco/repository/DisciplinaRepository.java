package br.com.ensinoemfoco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ensinoemfoco.entity.Disciplina;
import br.com.ensinoemfoco.entity.Professor;

import java.util.List;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {

    List<Disciplina> findByProfessor(Professor professor);

    List<Disciplina> findByProfessorId(Long professorId);
}