package com.ecommerce.web.jpa.e_commerce_web_jpa.Entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "omset")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Omset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "jumlah_penjualan")
    private Integer jumlahPenjualan;

    @OneToOne
    @JoinColumn(name = "produk", referencedColumnName = "id")
    private Produk idProduk;

    @OneToMany(mappedBy = "idOmset")
    private List<Transaksi> idTransaksi;

}
