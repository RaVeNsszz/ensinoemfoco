package br.com.ensinoemfoco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ensinoemfoco.entity.Professor;
import br.com.ensinoemfoco.entity.Usuario;

import java.util.Optional;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    Optional<Professor> findByUsuario(Usuario usuario);

    Optional<Professor> findByUsuarioId(Long usuarioId);
}