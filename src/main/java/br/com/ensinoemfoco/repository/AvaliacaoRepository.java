package br.com.ensinoemfoco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ensinoemfoco.entity.Avaliacao;

import java.util.List;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {

    List<Avaliacao> findByAlunoId(Long alunoId);

    List<Avaliacao> findByDisciplinaId(Long disciplinaId);

    List<Avaliacao> findByAlunoIdAndDisciplinaId(Long alunoId, Long disciplinaId);
}