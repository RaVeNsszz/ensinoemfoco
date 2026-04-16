package br.com.ensinoemfoco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ensinoemfoco.entity.Aluno;
import br.com.ensinoemfoco.entity.Usuario;

import java.util.Optional;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Optional<Aluno> findByUsuario(Usuario usuario);

    Optional<Aluno> findByUsuarioId(Long usuarioId);
}