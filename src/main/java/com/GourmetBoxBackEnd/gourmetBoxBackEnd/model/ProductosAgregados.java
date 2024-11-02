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
        private Integer id_productos_agregados;

        @ManyToOne
        @JoinColumn(name = "producto_id")
        private Producto producto;

        @Column(nullable = false)
        private Integer cantidad_producto;

        @OneToOne
        @JoinColumn(name = "usuario_id")
        private Usuario usuario;

        @ManyToOne
        @JoinColumn(name = "resumen_compra_id")
        private ResumenCompra resumenCompra;

        @Column(nullable = false)
        private Double subtotal;

        public ProductosAgregados() {}

    public ProductosAgregados(Integer id_productos_agregados,
                              Producto producto,
                              Integer cantidad_producto,
                              Usuario usuario,
                              ResumenCompra resumenCompra,
                              Double subtotal) {
        this.id_productos_agregados = id_productos_agregados;
        this.producto = producto;
        this.cantidad_producto = cantidad_producto;
        this.usuario = usuario;
        this.resumenCompra = resumenCompra;
        this.subtotal = subtotal;
    }


    public Integer getId_productos_agregados() {
        return id_productos_agregados;
    }

    public void setId_productos_agregados(Integer id_productos_agregados) {
        this.id_productos_agregados = id_productos_agregados;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(Integer cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ResumenCompra getResumenCompra() {
        return resumenCompra;
    }

    public void setResumenCompra(ResumenCompra resumenCompra) {
        this.resumenCompra = resumenCompra;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
}
