package com.upc.chinoesquina.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cliente")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cliente extends AuditoriaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer idCliente;
    private String nombre;
    private String apellido;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_documento_identidad", referencedColumnName = "id_documento_identidad")
    private DocumentoIdentidad documentoIdentidad;
    @Column(name = "nro_documento")
    private String nroDocumento;
    private String email;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DocumentoIdentidad getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(DocumentoIdentidad documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }
}
