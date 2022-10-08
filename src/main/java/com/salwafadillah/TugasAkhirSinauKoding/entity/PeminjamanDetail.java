package com.salwafadillah.TugasAkhirSinauKoding.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "peminjamanDetail")
@Getter
@Setter
@NoArgsConstructor
public class PeminjamanDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "BIGINT(11)")
    private Long peminjaman_id;

    @ManyToOne
    @JoinColumn(name = "buku_id")
    private Buku buku;
}
