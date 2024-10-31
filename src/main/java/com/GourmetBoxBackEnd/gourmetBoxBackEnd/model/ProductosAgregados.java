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
        private Integer idProductosAgregado;

        @Column(nullable = false)
        private Integer usuarioId;

        @Column(nullable = false)
        private Integer productoId;

        @Column(nullable = false)
        private Integer cantidadProducto;

        @Column(nullable = false)
        private Integer resumenCompraId;

        @Column(nullable = false)
        private Double subtotal;

        public ProductosAgregados() {}

        public ProductosAgregados(Integer idProductoAgregado, Integer usuario, Integer producto, Integer idResumenCompra,Integer cantidadProducto, Double subtotal) {
            this.idProductosAgregado = idProductoAgregado;
            this.usuarioId = usuario;
            this.productoId = producto;
            this.resumenCompraId = idResumenCompra;
            this.cantidadProducto = cantidadProducto;
            this.subtotal = subtotal;
        }


}
