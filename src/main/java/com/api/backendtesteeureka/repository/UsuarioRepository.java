package com.api.backendtesteeureka.repository;

import com.api.backendtesteeureka.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);

    @Query("SELECT u FROM Usuario u WHERE u.email= :email ")
    Usuario findByEmail(@Param("email") String email);
}
