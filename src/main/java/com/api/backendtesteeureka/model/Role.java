package com.api.backendtesteeureka.model;

import com.api.backendtesteeureka.enums.ERole;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole nome;

    public Role() {

    }

    public Role(ERole nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ERole getNome() {
        return nome;
    }

    public void setNome(ERole nome) {
        this.nome = nome;
    }
}