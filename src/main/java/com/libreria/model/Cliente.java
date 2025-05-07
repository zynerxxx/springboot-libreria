package com.libreria.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;

    @OneToMany(mappedBy = "cliente")
    private Set<Venta> ventas;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Set<Venta> getVentas() { return ventas; }
    public void setVentas(Set<Venta> ventas) { this.ventas = ventas; }
}
