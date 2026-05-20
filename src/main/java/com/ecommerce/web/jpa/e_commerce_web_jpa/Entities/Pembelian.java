package com.ecommerce.web.jpa.e_commerce_web_jpa.Entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pembelian")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pembelian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "seller", referencedColumnName = "id")
    private Seller seller;

    @ManyToOne
    @JoinColumn(name = "visitor", referencedColumnName = "id")
    private Visitor visitor;

    @Column(name = "purchase_date")
    private LocalDate purchasDate;

    @Column(name = "arrival_date")
    private LocalDate arrivalDate;

}
