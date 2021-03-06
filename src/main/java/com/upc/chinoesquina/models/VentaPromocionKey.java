package com.upc.chinoesquina.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

@Embeddable
public class VentaPromocionKey implements Serializable {
    @Column(name = "id_promocion")
    private Integer idPromocion;

    @Column(name = "id_venta")
    private Integer idVenta;

    public Integer getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(Integer idPromocion) {
        this.idPromocion = idPromocion;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }
}
