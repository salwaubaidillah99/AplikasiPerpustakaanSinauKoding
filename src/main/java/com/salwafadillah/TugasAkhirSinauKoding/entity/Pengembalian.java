package com.salwafadillah.TugasAkhirSinauKoding.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pengembalian")
@Getter
@Setter
@NoArgsConstructor
public class Pengembalian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT(11)")
    private Long id;

    @Column(columnDefinition = "VARCHAR(255)")
    private Date tglPengembalian;

    private Double denda;

    @ManyToOne
    @JoinColumn(name = "peminjaman_id")
    private Peminjaman peminjaman;

    @ManyToOne
    @JoinColumn(name = "anggota_id")
    private Anggota anggota;

    @ManyToOne
    @JoinColumn(name = "petugas_id")
    private Petugas petugas;


}