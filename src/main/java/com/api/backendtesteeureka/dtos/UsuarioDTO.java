package com.api.backendtesteeureka.dtos;


public record UsuarioDTO(
        Long id,
        String nome,
        String email,
        String cargo,
        String telefone,
        String password
) {
}
