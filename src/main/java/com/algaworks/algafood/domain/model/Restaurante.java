package com.algaworks.algafood.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Restaurante {

    @Id
    private Long id;

    @EqualsAndHashCode.Exclude
    private String nome;

    @Column(name = "taxa_frete")
    @EqualsAndHashCode.Exclude
    private BigDecimal taxaFrete;
}
