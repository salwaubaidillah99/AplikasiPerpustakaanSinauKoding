package com.salwafadillah.TugasAkhirSinauKoding.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(columnDefinition = "BIGINT(11)")
    private Long id_user;

    @Column(columnDefinition = "VARCHAR(255)")
    private String username;

    @Column(columnDefinition = "VARCHAR(255)")
    private String password;

    @Column(columnDefinition = "VARCHAR(255)")
    private String email;

    @Column(columnDefinition = "VARCHAR(255)")
    private String role;

    @OneToMany(mappedBy = "user")
    private List<Anggota> anggotaList;

    @OneToMany(mappedBy = "user")
    private List<Petugas> petugasList;
}