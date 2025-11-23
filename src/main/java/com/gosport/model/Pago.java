package com.gosport.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "pagos")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pago")
    private Integer idPago;

    // ---------------- CAMPOS ----------------

    @Column(name = "monto")
    private Double monto;

    @Column(name = "estado")
    private String estado;

    @Column(name = "fecha_pago")
    private LocalDateTime fechaPago;

    // --------------- FOREIGN KEYS ----------------

    @ManyToOne
    @JoinColumn(name = "id_reserva")
    private Reserva reserva;

    @ManyToOne
    @JoinColumn(name = "id_metodo_pago")
    private MetodoPagoRepository metodoPago;

    // --------------- RELACIONES ----------------

    @OneToMany(mappedBy = "pago")
    private List<Factura> facturas;
}
