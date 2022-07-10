package com.upc.chinoesquina.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "venta")
public class Venta extends AuditoriaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Integer idVenta;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    private Cliente objCliente;
    private Date fecha;

    @Column(name = "monto_venta")
    private Float montoVenta;

    @Column(name = "valor_venta")
    private Float valorVenta;

    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
    private Collection<VentaDetalle> ventaDetalle = new ArrayList<>();;

    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
    private Collection<VentaPromocion> ventaPromocion = new ArrayList<>();;

    @Column(name = "id_local")
    private Integer idLocal;

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Cliente getObjCliente() {
        return objCliente;
    }

    public void setObjCliente(Cliente objCliente) {
        this.objCliente = objCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Float getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(Float montoVenta) {
        this.montoVenta = montoVenta;
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

    public Collection<VentaPromocion> getVentaPromocion() {
        return ventaPromocion;
    }

    public void setVentaPromocion(Collection<VentaPromocion> ventaPromocion) {
        this.ventaPromocion = ventaPromocion;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }
}
