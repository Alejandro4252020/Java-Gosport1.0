package com.gosport.repository;

import com.gosport.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Integer> {
    // Facturas por usuario
    List<Factura> findByUsuarioIdUsuario(Integer idUsuario);

    // Facturas por reserva
    List<Factura> findByReservaIdReserva(Integer idReserva);

    // Facturas por cancha
    List<Factura> findByCanchaIdCancha(Integer idCancha);

    static Optional<Factura> findById(Long id) {
       
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
}
