package com.api.backendtesteeureka.service;

import com.api.backendtesteeureka.model.Role;
import com.api.backendtesteeureka.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role findById(Long role) {
        return roleRepository.findById(role).orElse(null);
    }
}
