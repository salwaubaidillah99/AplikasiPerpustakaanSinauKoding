package com.salwafadillah.TugasAkhirSinauKoding.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "petugas")
@Getter
@Setter
@NoArgsConstructor
public class Petugas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT(11)")
    private Long id;

    @Column(columnDefinition = "VARCHAR(255)")
    private String nama;

    @Column(columnDefinition = "VARCHAR(20)")
    private String telp;

    @Column(columnDefinition = "TINYTEXT")
    private String alamat;

    @OneToMany(mappedBy = "petugas")
    private List<Peminjaman> peminjamanList;

    @OneToMany(mappedBy = "petugas")
    private List<Pengembalian> pengembalianList;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}