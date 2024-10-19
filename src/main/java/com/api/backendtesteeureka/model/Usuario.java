package com.api.backendtesteeureka.model;

import com.api.backendtesteeureka.dtos.UsuarioDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

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

    private String cargo;

    private String telefone;

    @JsonIgnore
    private String password;

    private String token;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime token_creation_date;

    public Usuario(UsuarioDTO usuarioDTO) {
        this.id = usuarioDTO.id();
        this.nome = usuarioDTO.nome();
        this.email = usuarioDTO.email();
        this.cargo = usuarioDTO.cargo();
        this.telefone = usuarioDTO.telefone();
        this.password = usuarioDTO.password();
    }


}
