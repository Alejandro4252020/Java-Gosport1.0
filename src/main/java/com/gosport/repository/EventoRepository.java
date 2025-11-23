package com.gosport.repository;

import com.gosport.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer> {
    // Ejemplo: buscar eventos por deporte
    List<Evento> findByDeporteIdDeporte(Integer idDeporte);

    // Ejemplo: buscar eventos por reserva
    List<Evento> findByReservaIdReserva(Integer idReserva);
}
