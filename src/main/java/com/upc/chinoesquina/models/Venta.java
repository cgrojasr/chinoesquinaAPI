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
}
