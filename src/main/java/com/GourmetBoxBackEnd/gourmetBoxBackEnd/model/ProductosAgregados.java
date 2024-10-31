package com.GourmetBoxBackEnd.gourmetBoxBackEnd.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class ProductosAgregados {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer idProductoAgregado;

        @Column(nullable = false)
        private Usuario usuario;

        @Column(nullable = false)
        private Producto producto;

        @Column(nullable = false)
        private Integer cantidadProducto;

        @Column(nullable = false)
        private Double subtotal;

        public ProductosAgregados() {}

        public ProductosAgregados(Integer idProductoAgregado, Usuario usuario, Producto producto, Integer cantidadProducto, Double subtotal) {
            this.idProductoAgregado = idProductoAgregado;
            this.usuario = usuario;
            this.producto = producto;
            this.cantidadProducto = cantidadProducto;
            this.subtotal = subtotal;
        }


}
