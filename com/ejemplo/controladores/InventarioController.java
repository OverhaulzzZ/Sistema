package com.ejemplo.controladores;

import com.ejemplo.modelos.Producto;
import com.ejemplo.utilidades.ConexionBD;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InventarioController {

    public void agregarProducto(Producto producto) {
        // Implementar la lógica para agregar producto a la base de datos
    }

    public List<Producto> obtenerProductos() {
        List<Producto> productos = new ArrayList<>();
        try (Connection conn = ConexionBD.getConnection()) {
            // Implementar la lógica para obtener productos desde la base de datos
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productos;
    }

    public void actualizarProducto(Producto producto) {
        // Implementar la lógica para actualizar el producto en la base de datos
    }

    public void eliminarProducto(int id) {
        // Implementar la lógica para eliminar el producto de la base de datos
    }
}
