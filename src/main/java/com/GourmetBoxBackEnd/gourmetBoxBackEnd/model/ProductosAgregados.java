package com.GourmetBoxBackEnd.gourmetBoxBackEnd.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class ProductosAgregados {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Integer idProductoAgregado;

        @Column(nullable = false)
        private Integer idUsuario;

        @Column(nullable = false)
        private Integer idProducto;

        @Column(nullable = false)
        private Integer cantidadProducto;

        @Column(nullable = false)
        private Integer idResumenCompra;

        @Column(nullable = false)
        private Double subtotal;

        public ProductosAgregados() {}

        public ProductosAgregados(Integer idProductoAgregado, Integer usuario, Integer producto, Integer idResumenCompra,Integer cantidadProducto, Double subtotal) {
            this.idProductoAgregado = idProductoAgregado;
            this.idUsuario = usuario;
            this.idProducto = producto;
            this.idResumenCompra = idResumenCompra;
            this.cantidadProducto = cantidadProducto;
            this.subtotal = subtotal;
        }


}
