package com.libreria.model;

import jakarta.persistence.*;
import java.util.Set;
import java.time.LocalDate;

@Entity
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "venta")
    private Set<DetalleVenta> detalles;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public Set<DetalleVenta> getDetalles() { return detalles; }
    public void setDetalles(Set<DetalleVenta> detalles) { this.detalles = detalles; }
}
