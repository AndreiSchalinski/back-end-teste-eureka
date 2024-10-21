package com.api.backendtesteeureka.dtos;


import com.api.backendtesteeureka.model.Role;

import java.util.Set;

public record UsuarioDTO(
        Long id,
        String nome,
        String email,
        String cargo,
        String telefone,
        String username,
        String password,
        Long role,
        Set<Role> roles
) {
}
