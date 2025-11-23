package com.gosport.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tipocancha")
public class Tipocancha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tipo_cancha;

    private String nombre;
}
