package com.upc.chinoesquina.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "producto_venta")
public class ProductoVenta extends AuditoriaData{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_venta")
    private Integer idProductoVenta;

    @Column(name = "valor_venta")
    private Float valorVenta;

    @Column(name = "id_local")
    private Integer idLocal;

    @Column(name = "id_producto")
    private Integer idProducto;

    @OneToMany(mappedBy = "productoVenta", cascade = CascadeType.ALL)
    private Collection<VentaDetalle> ventaDetalle = new ArrayList<>();

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

    public Collection<VentaDetalle> getVentaDetalle() {
        return ventaDetalle;
    }

    public void setVentaDetalle(Collection<VentaDetalle> ventaDetalle) {
        this.ventaDetalle = ventaDetalle;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}
