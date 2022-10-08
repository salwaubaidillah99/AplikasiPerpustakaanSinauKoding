package com.salwafadillah.TugasAkhirSinauKoding.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pengarang")
@Getter
@Setter
@NoArgsConstructor
public class Pengarang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT(11)")
    private Long id;

    @Column(columnDefinition = "VARCHAR(255)")
    private String nama;

    @Column(columnDefinition = "VARCHAR(255)")
    private String alamat;

    @Column(columnDefinition = "VARCHAR(20)")
    private String telp;

    @OneToMany(mappedBy = "pengarang")
    private List<Buku> bukuList;

}

