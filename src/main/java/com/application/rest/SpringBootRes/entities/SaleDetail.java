package com.application.rest.SpringBootRes.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detalleVenta")
public class SaleDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="id_producto", nullable = false)
    @JsonIgnore
    private Product product;
    @Column(name="cantidad")
    private int quantity;
    @Column(name="precio")
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name="id_venta", nullable = false)
    @JsonIgnore
    private Sale sale;
}
