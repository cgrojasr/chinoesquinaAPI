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

    @Column(name = "valor_venta")
    private Float valorVenta;

    private Integer cantidad;

    private Boolean eliminado;

    public VentaProductoKey getId() {
        return id;
    }

    public void setId(VentaProductoKey id) {
        this.id = id;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public ProductoVenta getProductoVenta() {
        return productoVenta;
    }

    public void setProductoVenta(ProductoVenta productoVenta) {
        this.productoVenta = productoVenta;
    }

    public Float getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(Float valorVenta) {
        this.valorVenta = valorVenta;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }
}
