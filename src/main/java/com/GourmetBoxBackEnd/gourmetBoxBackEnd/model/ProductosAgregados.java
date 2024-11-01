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
        private Integer id_productos_agregados;

        @ManyToOne
        @JoinColumn(name = "id_producto")
        private Producto producto_id;

        @Column(nullable = false)
        private Integer cantidad_producto;

        @OneToOne
        @JoinColumn(name = "id_usuario")
        private Usuario usuario_id;

        @ManyToOne
        @JoinColumn(name = "id_resumen_compra")
        private ResumenCompra resumen_compra_id;

        @Column(nullable = false)
        private Double subtotal;

        public ProductosAgregados() {}

    public ProductosAgregados(Integer id_productos_agregados, Producto producto_id, Integer cantidad_producto, Usuario usuario_id, ResumenCompra resumen_compra_id, Double subtotal) {
        this.id_productos_agregados = id_productos_agregados;
        this.producto_id = producto_id;
        this.cantidad_producto = cantidad_producto;
        this.usuario_id = usuario_id;
        this.resumen_compra_id = resumen_compra_id;
        this.subtotal = subtotal;
    }
}
