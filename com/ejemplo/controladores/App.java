package com.ejemplo.controladores;

import com.ejemplo.modelos.Producto;

import java.util.List;

public class App {
    public static void main(String[] args) {

        System.out.print ("aplicacion iniciada");
        // Crear una instancia del controlador de inventario
        InventarioController controller = new InventarioController ();

        // Agregar un producto
        Producto nuevoProducto = new Producto(1, "Laptop", 10, 799.99);
        controller.agregarProducto(nuevoProducto);

        // Obtener y mostrar productos
        List<Producto> productos = controller.obtenerProductos();
        for (Producto producto : productos) {
            System.out.println(producto);
        }

        // Actualizar un producto
        nuevoProducto.setPrecio(749.99);
        controller.actualizarProducto(nuevoProducto);

        // Obtener y mostrar productos después de la actualización
        productos = controller.obtenerProductos();
        for (Producto producto : productos) {
            System.out.println(producto);
        }

        // Eliminar un producto
        controller.eliminarProducto(1);

        // Obtener y mostrar productos después de la eliminación
        productos = controller.obtenerProductos();
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
