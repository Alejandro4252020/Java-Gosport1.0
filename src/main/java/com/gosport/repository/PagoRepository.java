package com.gosport.repository;

import com.gosport.model.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Integer> {
    // Pagos por reserva
    List<Pago> findByReservaIdReserva(Integer idReserva);

    // Pagos por estado (ej: pendiente, confirmado)
    List<Pago> findByEstado(String estado);
}
