package com.upc.chinoesquina.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "venta_detalle")
public class VentaDetalle {
    @EmbeddedId
    private VentaProductoKey idVentaDetalle;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("idVenta")
    @JoinColumn(name = "id_venta")
    @JsonIgnore
    private Venta venta;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("idProductoVenta")
    @JoinColumn(name = "id_producto_venta")
    @JsonIgnore
    private ProductoVenta productoVenta;

    @Column(name = "valor_venta")
    private Float valorVenta;

    private Integer cantidad;

    private Boolean eliminado;

    public VentaProductoKey getIdVentaDetalle() {
        return idVentaDetalle;
    }

    public void setIdVentaDetalle(VentaProductoKey idVentaDetalle) {
        this.idVentaDetalle = idVentaDetalle;
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
