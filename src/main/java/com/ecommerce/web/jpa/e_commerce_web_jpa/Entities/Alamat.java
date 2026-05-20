package com.ecommerce.web.jpa.e_commerce_web_jpa.Entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Alamat {

    String jalan;

    String kota;

    String Province;
}
