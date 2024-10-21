package com.api.backendtesteeureka.controller;

import com.api.backendtesteeureka.dtos.UsuarioDTO;
import com.api.backendtesteeureka.model.Role;
import com.api.backendtesteeureka.model.Usuario;
import com.api.backendtesteeureka.service.RoleService;
import com.api.backendtesteeureka.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    final UsuarioService usuarioService;

    final RoleService roleService;

    public UsuarioController(UsuarioService usuarioService, RoleService roleService) {
        this.usuarioService = usuarioService;
        this.roleService = roleService;
    }

    @PostMapping("salvar")
    @Transactional
    public ResponseEntity<?> cadastrar(@RequestBody @Valid UsuarioDTO usuarioDTO){

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        Role roleSelected = roleService.findById(usuarioDTO.role());

        usuarioDTO.roles().add(roleSelected);

        Usuario usuario = new Usuario(usuarioDTO);

        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));

        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(usuario));
    }

    @GetMapping("carregar")
    @Transactional
    public ResponseEntity<List<Usuario>> carregarUsuarios(){

        List<Usuario> listUsuarios = usuarioService.carregar();

        return ResponseEntity.ok().body(listUsuarios);

    }
}
