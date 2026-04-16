package br.com.ensinoemfoco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ensinoemfoco.entity.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);

    boolean existsByEmail(String email);
}