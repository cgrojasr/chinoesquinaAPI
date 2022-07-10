package com.upc.chinoesquina.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class VentaProductoKey implements Serializable {
    @Column(name = "id_venta")
    private Integer idVenta;

    @Column(name = "id_producto_venta")
    private Integer idProductoVenta;

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Integer getIdProductoVenta() {
        return idProductoVenta;
    }

    public void setIdProductoVenta(Integer idProductoVenta) {
        this.idProductoVenta = idProductoVenta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VentaProductoKey)) return false;
        VentaProductoKey that = (VentaProductoKey) o;
        return Objects.equals(getIdVenta(), that.getIdVenta()) && Objects.equals(getIdProductoVenta(), that.getIdProductoVenta());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdVenta(), getIdProductoVenta());
    }
}
