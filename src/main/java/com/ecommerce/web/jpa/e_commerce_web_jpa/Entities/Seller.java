package com.ecommerce.web.jpa.e_commerce_web_jpa.Entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "seller")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Seller {

    @Id
    private String id;

    @Column(name = "owner_name")
    private String ownerName;

    @Column(name = "shop_name")
    private String shopName;

    private String email;

    private String password;

    @Embedded
    private Alamat alamat;

    @OneToMany(mappedBy = "seller")
    private List<Product> products;

    @OneToMany(mappedBy = "seller")
    private List<Pembelian> purchases;

}
