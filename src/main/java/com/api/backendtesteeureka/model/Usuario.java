package com.api.backendtesteeureka.model;

import com.api.backendtesteeureka.dtos.UsuarioDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Usuario")
@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String telefone;

    private String cargo;

    private String username;

    @JsonIgnore
    private String password;

    private Long role;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(  name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public Usuario(UsuarioDTO usuarioDTO) {
        this.id = usuarioDTO.id();
        this.nome = usuarioDTO.nome();
        this.email = usuarioDTO.email();
        this.cargo = usuarioDTO.cargo();
        this.telefone = usuarioDTO.telefone();
        this.username = usuarioDTO.username();
        this.password = usuarioDTO.password();
        this.role = usuarioDTO.role();
        this.roles = usuarioDTO.roles();
    }


}
