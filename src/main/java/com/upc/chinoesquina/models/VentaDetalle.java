package com.upc.chinoesquina.models;

import javax.persistence.*;

@Entity
@Table(name = "venta_detalle")
public class VentaDetalle {
    @EmbeddedId
    private VentaProductoKey id;

    @ManyToOne
    @MapsId("id_venta")
    @JoinColumn(name = "id_venta")
    private Venta venta;

    @ManyToOne
    @MapsId("id_producto_venta")
    @JoinColumn(name = "id_producto_venta")
    private ProductoVenta productoVenta;

    @Column(name = "valor_compra")
    private Float valorCompra;

    private Integer cantidad;

    private Boolean eliminado;
}
