package com.upc.chinoesquina.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "producto_venta")
public class ProductoVenta extends AuditoriaData{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_venta")
    private Integer idProductoVenta;

    @Column(name = "valor_venta")
    private Float valorVenta;

    @OneToMany(mappedBy = "productoVenta")
    private Set<VentaDetalle> ventaDetalle;

    public Integer getIdProductoVenta() {
        return idProductoVenta;
    }

    public void setIdProductoVenta(Integer idProductoVenta) {
        this.idProductoVenta = idProductoVenta;
    }

    public Float getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(Float valorVenta) {
        this.valorVenta = valorVenta;
    }

    public Set<VentaDetalle> getVentaDetalle() {
        return ventaDetalle;
    }

    public void setVentaDetalle(Set<VentaDetalle> ventaDetalle) {
        this.ventaDetalle = ventaDetalle;
    }
}
