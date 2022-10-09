package com.salwafadillah.TugasAkhirSinauKoding.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "peminjaman")
@Getter
@Setter
@NoArgsConstructor
public class Peminjaman {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT(11)")
    private Long id;

    private Date tglPinjam;

    private Date tglkembali;

    @OneToMany(mappedBy = "peminjaman")
    private List<Pengembalian> pengembalianList;

    @ManyToOne
    @JoinColumn(name = "anggota_id")
    private Anggota anggota;

    @ManyToOne
    @JoinColumn(name = "petugas_id")
    private Petugas petugas;


}