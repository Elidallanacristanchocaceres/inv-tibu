package com.inventariotibu.inv_tibu.domain.entities;

import com.inventariotibu.inv_tibu.domain.fkclass.ProductProviderid;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Table(name = "products_providers")
@Entity
public class ProductProvider {
    @EmbeddedId
    private ProductProviderid id;

    @ManyToOne
    @JoinColumn(name = "product_id",insertable = false,updatable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "provider_id",insertable = false,updatable = false)
    private Provider provider;
}
