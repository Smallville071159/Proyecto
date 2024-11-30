package com.proyecto.proyecto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Producto {
    private Integer idProducto;
    private String nombre;
    private double valor;
    private int cantidad;
    
  
}
