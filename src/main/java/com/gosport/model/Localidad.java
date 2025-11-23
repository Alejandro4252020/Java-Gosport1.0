package com.gosport.model;

import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "localidad")
public class Localidad<Ciudad> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_localidad")
    private Integer idLocalidad;

    @Column(name = "nombre_localidad")
    private String nombreLocalidad;

    // ---- FOREIGN KEY ----
    @ManyToOne
    @JoinColumn(name = "id_ciudad")
    private Ciudad ciudad;

    // ---- RELACIÓN 1:N ----
    @OneToMany(mappedBy = "localidad")
    private List<Direccion> direcciones;

}
