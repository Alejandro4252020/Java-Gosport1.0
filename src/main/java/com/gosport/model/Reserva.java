package com.gosport.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

import com.gosport.dto.UsuarioDto;

@Entity
@Data
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_reserva;

    private LocalDateTime fecha;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_cancha")
    private Cancha cancha;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private UsuarioDto usuario;
}
