package com.salwafadillah.TugasAkhirSinauKoding.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "anggota")
@Getter
@Setter
@NoArgsConstructor
public class Anggota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT(11)")
    private Long id;

    @Column(columnDefinition = "VARCHAR(255)")
    private String nama;

    @Column(columnDefinition = "VARCHAR(255)")
    private String jenisKelamin;

    @Column(columnDefinition = "VARCHAR(255)")
    private String alamat;

    @Column(columnDefinition = "VARCHAR(20)")
    private String telp;

    @OneToMany(mappedBy = "anggota")
    private List<Peminjaman> peminjamanList;

    @OneToMany(mappedBy = "anggota")
    private List<Pengembalian> pengembalianList;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

}
