package com.gosport.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

import org.bouncycastle.jcajce.provider.symmetric.ChaCha;

import com.gosport.dto.UsuarioDto;

@Entity
@Data
@Table(name = "facturas")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_factura;

    private Double total;
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private UsuarioDto usuario;

    @ManyToOne
    @JoinColumn(name = "id_cancha")
    private ChaCha cancha;

    public Object getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    public Object getCliente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCliente'");
    }
}
