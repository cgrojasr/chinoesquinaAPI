package com.upc.chinoesquina.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "venta")
public class Venta extends AuditoriaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Integer idVenta;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    private Cliente objCliente;
    private Date fecha;

    @Column(name = "monto_venta")
    private Float montoVenta;

    @Column(name = "valor_venta")
    private Float valorVenta;

    @OneToMany(mappedBy = "venta")
    private Set<VentaDetalle> ventaDetalle;

    @OneToMany(mappedBy = "venta")
    private Set<VentaPromocion> ventaPromocion;

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

    public Set<VentaDetalle> getVentaDetalle() {
        return ventaDetalle;
    }

    public void setVentaDetalle(Set<VentaDetalle> ventaDetalle) {
        this.ventaDetalle = ventaDetalle;
    }

    public Set<VentaPromocion> getVentaPromocion() {
        return ventaPromocion;
    }

    public void setVentaPromocion(Set<VentaPromocion> ventaPromocion) {
        this.ventaPromocion = ventaPromocion;
    }
}
