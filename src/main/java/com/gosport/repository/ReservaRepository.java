package com.gosport.repository;

import com.gosport.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
    // Reservas de un cliente
    List<Reserva> findByClienteIdUsuario(Integer idCliente);

    // Reservas por cancha
    List<Reserva> findByCanchaIdCancha(Integer idCancha);

    // Reservas en un rango de fecha (ejemplo)
    List<Reserva> findByFechaInicioBetween(LocalDateTime desde, LocalDateTime hasta);
}
