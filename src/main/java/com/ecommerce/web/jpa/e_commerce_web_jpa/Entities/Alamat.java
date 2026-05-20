package com.ecommerce.web.jpa.e_commerce_web_jpa.Entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Alamat {

    String jalan;

    String kota;

    String province;
}
