package com.application.rest.SpringBootRes.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "venta")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "total")
    private BigDecimal total;
    @Column(name="fecha")
    @Temporal(TemporalType.DATE)
    private Date date;
    @ManyToOne
    @JoinColumn(name = "id_cliente",nullable = false)
    @JsonIgnore
    private Client client;
    @ManyToOne
    @JoinColumn(name = "id_usuario",nullable = false)
    @JsonIgnore
    private User user;
    @OneToMany(mappedBy = "sale", cascade = CascadeType.ALL,fetch = FetchType.LAZY, orphanRemoval = true)
    @JsonIgnore
    private List<SaleDetail> saleDetails = new ArrayList<>();
}
