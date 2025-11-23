package com.gosport.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "metodos_pago")
public class MetodoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_metodo")
    private Long id;

    @Column(name = "nombre_metodo")
    private String nombreMetodo;
}
