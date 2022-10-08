package com.salwafadillah.TugasAkhirSinauKoding.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pengembalianDetail")
@Getter
@Setter
@NoArgsConstructor
public class PengembalianDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "BIGINT(11)")
    private Long pengembalian_id;

    @ManyToOne
    @JoinColumn(name = "buku_id")
    private Buku buku;
}
